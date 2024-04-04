public class Bond {
  private double sellingPrice;
  private double faceValue;
  private double interestPayment;
  private double duration;
  private YieldCalculation yieldCalculation;

  private Bond(BondBuilder bond) {
    try {
      check(bond.sellingPrice, bond.faceValue, bond.interestPayment, bond.duration);
      this.sellingPrice = bond.sellingPrice;
      this.faceValue = bond.faceValue;
      this.interestPayment = bond.interestPayment;
      this.duration = bond.duration;
    } catch (IllegalArgumentException e) {
      // TODO: handle exception
      System.out.println(
          "Interest Payment >= 0 \nSelling Price > 0 \nFace Value > 0 \nDuration > 0");
      e.printStackTrace();
    }
  }

  public double getSellingPrice() {
    return this.sellingPrice;
  }

  public double getFaceValue() {
    return this.faceValue;
  }

  public double getInterestPayment() {
    return this.interestPayment;
  }

  public double getDuration() {
    return this.duration;
  }

  private void check(double sellingPrice, double faceValue, double interestPayment, double duration)
      throws IllegalArgumentException {
    if (interestPayment < 0 || sellingPrice <= 0 || faceValue <= 0 || duration <= 0) {
      throw new IllegalArgumentException();
    }
  }

  public void setYieldCalculation(YieldCalculation y) {
    this.yieldCalculation = y;
  }

  public double calculateYTM() {
    return this.yieldCalculation.yieldToMaturity(this);
  }

  public static class BondBuilder {
    private double duration = 1;
    private double faceValue = 1000;
    private double interestPayment = 10;
    private double sellingPrice = 1000;
    private YieldCalculation yieldCalculation;

    public BondBuilder setDuration(double dur) {
      this.duration = dur;
      return this;
    }

    public BondBuilder setSellingPrice(double sell) {
      this.sellingPrice = sell;
      return this;
    }

    public BondBuilder setFaceValue(double value) {
      this.faceValue = value;
      return this;
    }

    public BondBuilder setInterestPayment(double interes) {
      this.interestPayment = interes;
      return this;
    }

    public BondBuilder setYieldCalculation(YieldCalculation y) {
      this.yieldCalculation = y;
      return this;
    }

    public Bond createBond() {
      return new Bond(this);
    }
  }
}
