public class TestPostfix {
  public static void main(String[] args) {
    PostfixExpression x = new PostfixExpression("1");
    System.out.println(x.evaluateExpression());
    PostfixExpression y = new PostfixExpression("23+");
    System.out.println(y.evaluateExpression());
  }
}
