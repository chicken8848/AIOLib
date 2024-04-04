public class ZeroCouponYield implements YieldCalculation {

  public ZeroCouponYield() {}

  @Override
  public double yieldToMaturity(Bond bond) {
    return Math.pow((bond.getFaceValue() / bond.getSellingPrice()), 1 / bond.getDuration()) - 1;
  }
}
