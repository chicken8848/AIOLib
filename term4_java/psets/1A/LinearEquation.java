class LinearEquation {
  private double a;
  private double b;
  private double c;
  private double d;
  private double e;
  private double f;

  LinearEquation(double g, double h, double i, double j, double k, double l) {
    a = g;
    b = h;
    c = i;
    d = j;
    e = k;
    f = l;
  }

  public boolean isSolvable() {
    return (this.a * this.d - this.b * this.c != 0);
  }

  public double getX() {
    return ((this.e / this.b) - (this.f / this.d)) / ((this.a / this.b) - (this.c / this.d));
  }

  public double getY() {
    double x = getX();
    return (this.f / this.d) - (this.c * x / this.d);
  }
}
