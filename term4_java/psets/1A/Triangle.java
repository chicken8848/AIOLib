class Triangle {

  private double side1;
  private double side2;
  private double side3;

  Triangle() {
    this(1.0, 1.0, 1.0);
  }

  Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getArea() {
    double a2 = Math.pow(side1, 2);
    double b2 = Math.pow(side2, 2);
    double c2 = Math.pow(side3, 2);
    return 0.25 * Math.sqrt(4 * a2 * b2 - Math.pow(a2 + b2 - c2, 2));
  }

  public double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  @Override
  public String toString() {
    return "Triange: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
}
