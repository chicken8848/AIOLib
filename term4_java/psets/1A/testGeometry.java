public class testGeometry {
  public static void main(String[] args) {

    MyRectangle2D rectum_1 = new MyRectangle2D();
    MyRectangle2D rectum_2 = new MyRectangle2D(0.5, 0.5);

    System.out.println(rectum_1.contains(rectum_2));
    System.out.println(rectum_1.overlaps(rectum_2));
    System.out.println(rectum_1.contains(0.5, 0.5));
    System.out.println(rectum_1.getArea());
  }
}

class MyRectangle2D {
  private double x;
  private double y;
  private double width;
  private double height;

  MyRectangle2D() {
    x = 0;
    y = 0;
    width = 1;
    height = 1;
  }

  MyRectangle2D(double newX, double newY) {
    x = newX;
    y = newY;
    width = 1;
    height = 1;
  }

  /*
  MyRectangle2D(double newWidth, double newHeight) {
    x = 0;
    y = 0;
    width = newWidth;
    height = newHeight;
  }
  */

  MyRectangle2D(double newX, double newY, double newWidth, double newHeight) {
    x = newX;
    y = newY;
    width = newHeight;
    height = newHeight;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double setHeight(double newHeight) {
    height = newHeight;
    return y;
  }

  public double setWidth(double newWidth) {
    width = newWidth;
    return x;
  }

  public double getArea() {
    return height * width;
  }

  public double getParameter() {
    return 2 * width + 2 * height;
  }

  public boolean contains(double x_2, double y_2) {
    return (x + width >= x_2) && (y + height >= y_2);
  }

  public boolean contains(MyRectangle2D r) {
    return (x <= r.x && y <= r.y && x + width >= r.x + r.width && y + height >= r.y + r.height);
  }

  public boolean overlaps(MyRectangle2D r) {
    return (x <= r.x || y <= r.y || x + width >= r.x + r.width || y + height >= r.y + r.height);
  }
}
