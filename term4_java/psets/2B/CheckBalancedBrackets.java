// import CustomStack;
// import StackImpl;

public class CheckBalancedBrackets {

  public static void main(String[] args) {

    System.out.println(isOpenBracket('('));
    System.out.println(isOpenBracket('a'));
    System.out.println(isCloseBracket(']'));
    System.out.println(isCloseBracket('a'));
    System.out.println(isMatchBracket('(', ')'));
    System.out.println(isMatchBracket('a', 'a'));
    System.out.println(isBalancedBrackets("()[]()"));
    System.out.println(isBalancedBrackets("([]())"));
  }

  public static boolean isBalancedBrackets(String expression) {
    CustomStack<Character> stck = new StackImpl<>();
    char[] char_array = expression.toCharArray();
    for (char c : char_array) {
      if (isOpenBracket(c)) {
        stck.push(c);
      }
      if (isCloseBracket(c)) {
        char c1 = stck.pop();
        if (isMatchBracket(c1, c) == false) {
          return false;
        }
      }
    }
    if (stck.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isOpenBracket(char c) {
    String brackets = "({[";
    return brackets.contains(Character.toString(c));
  }

  public static boolean isCloseBracket(char c) {
    String brackets = ")}]";
    return brackets.contains(Character.toString(c));
  }

  public static boolean isMatchBracket(char c1, char c2) {
    switch (c1) {
      case '(':
        return c2 == ')';
      case '{':
        return c2 == '}';
      case '[':
        return c2 == ']';
      default:
        return false;
    }
  }
}
