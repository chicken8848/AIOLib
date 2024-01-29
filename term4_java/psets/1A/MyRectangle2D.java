public class MyRectangle2D {
  double x;
  double y;
  double width;
  double height;

  MyRectangle2D() {
    this.x = 0;
    this.y = 0;
    this.width = 1;
    this.height = 1;
  }

  /*
  MyRectangle2D(double newX, double newY) {
    this.x = newX;
    this.y = newY;
    this.width = 1;
    this.height = 1;
  }

  MyRectangle2D(double newWidth, double newHeight) {
    this.x = 0;
    y = 0;
    this.width = newWidth;
    this.height = newHeight;
  }
  */

  MyRectangle2D(double newX, double newY, double newWidth, double newHeight) {
    this.x = newX;
    this.y = newY;
    this.width = newWidth;
    this.height = newHeight;
  }

  public void setX(double ex) {
    this.x = ex;
  }

  public void setY(double ey) {
    this.y = ey;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double newHeight) {
    this.height = newHeight;
  }

  public void setWidth(double newWidth) {
    this.width = newWidth;
  }

  public double getArea() {
    return this.getWidth() * this.getHeight();
  }

  public double getParameter() {
    return 2 * this.width + 2 * this.height;
  }

  public boolean contains(double x_2, double y_2) {
    return Math.abs(this.x - x_2) < 0.5 * this.width && Math.abs(this.y - y_2) < 0.5 * this.height;
  }

  public boolean contains(MyRectangle2D r) {
    return contains(r.x, r.y)
        && (Math.abs(r.x - this.x) + 0.5 * r.x) <= (0.5 * this.width)
        && (Math.abs(r.y - this.y) + 0.5 * r.y) <= (0.5 * this.height);
  }

  public boolean overlaps(MyRectangle2D r) {
    return Math.abs(r.x - this.x) <= r.width + this.width
        && Math.abs(r.y - this.y) <= r.height + this.height;
  }
}
