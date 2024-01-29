public class testGeometry {
  public static void main(String[] args) {}
}

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
    return (r.x - r.width / 2) >= (this.x - this.width / 2)
        && (r.x + r.width / 2) <= (this.x + this.width / 2)
        && (r.y - r.height / 2) >= (this.y - this.height / 2)
        && (r.y + r.height / 2) <= (this.y + this.height / 2);
  }

  public boolean overlaps(MyRectangle2D r) {
    double distanceX = Math.abs(r.x - this.x);
    double distanceY = Math.abs(r.y - this.y);
    double sumWidth = (r.width + this.width) / 2;
    double sumHeight = (r.height + this.height) / 2;

    return distanceX <= sumWidth && distanceY <= sumHeight;
  }
}
