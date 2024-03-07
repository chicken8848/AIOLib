public abstract class FixExpression {

  private String expression;
  private String validChars = "0123456789+-*/";

  // you may encounter issues if this is not declared public
  public FixExpression(String expression) {
    this.expression = expression;
  }

  // complete this method
  public boolean isValidString() {
    String[] exp_array = this.expression.split("");
    for (String s : exp_array) {
      if (!validChars.contains(s)) {
        return false;
      }
    }
    return true;
  }

  public String getExpression() {
    return expression;
  }

  public String getValidChars() {
    return validChars;
  }

  public abstract int evaluateExpression();
}
