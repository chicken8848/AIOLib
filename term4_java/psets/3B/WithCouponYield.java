public class WithCouponYield implements YieldCalculation {
  private Bond bond;

  public WithCouponYield() {}

  @Override
  public double yieldToMaturity(Bond bond) {
    this.bond = bond;
    double r_up = 1;
    double r_down = Math.pow(10, -10);
    double delta = r_up - r_down;
    while (delta > Math.pow(10, -5)) {
      double r_middle = 0.5 * (r_up + r_down);
      if ((f(r_up) < 0) ^ (f(r_down) < 0)) {
        r_up = r_middle;
      }
      if ((f(r_middle) < 0) ^ (f(r_down) < 0)) {
        r_down = r_middle;
      }
      delta = r_up - r_down;
    }
    return 0.5 * (r_up + r_down);
  }

  private double f(double r) {
    return bond.getSellingPrice()
        - (bond.getInterestPayment() * (1 - Math.pow(1 / (1 + r), bond.getDuration())) / r)
        - bond.getFaceValue() / Math.pow(1 + r, bond.getDuration());
  }
}
