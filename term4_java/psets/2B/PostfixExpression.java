public class PostfixExpression extends FixExpression {

  public PostfixExpression(String expression) {
    super(expression);
  }

  @Override
  public int evaluateExpression() {
    CustomStack<Integer> stack = new StackImpl<>();
    char[] char_array = getExpression().toCharArray();
    if (isValidString()) {
      for (char c : char_array) {
        if (isOperand(c)) {
          int temp1 = Character.getNumericValue(c);
          stack.push(temp1);
        } else {
          int p1 = stack.pop();
          int p2 = stack.pop();
          int p3 = getValue(p1, p2, c);
          stack.push(p3);
        }
      }
      return stack.pop();
    } else {
      return 0;
    }
  }

  private boolean isOperand(char c) {
    String valid_operands = "0123456789";
    char[] char_array = valid_operands.toCharArray();
    for (char d : char_array) {
      if (d == c) {
        return true;
      }
    }
    return false;
  }

  private int getValue(int p1, int p2, int c) {
    switch (c) {
      case '+':
        return p1 + p2;
      case '*':
        return p1 * p2;
      case '/':
        return p2 / p1;
      case '-':
        return p2 - p1;
      default:
        return 0;
    }
  }
}
