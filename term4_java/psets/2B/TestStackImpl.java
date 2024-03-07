
public class TestStackImpl {

  public static void main(String[] args) {

    CustomStack<Integer> integerStack = new StackImpl<Integer>();
    System.out.println(integerStack.isEmpty()); // true
    System.out.println(integerStack.size()); // 0
    System.out.println(integerStack.peek()); // null
    System.out.println(integerStack.pop()); // null

    integerStack.push(10);
    integerStack.push(21);
    integerStack.push(63);
    integerStack.push(54);

    System.out.println(integerStack.isEmpty()); // false
    System.out.println(integerStack.size()); // 4
    System.out.println(integerStack.peek()); // 54
    System.out.println(integerStack.pop()); // 54
    System.out.println(integerStack.size()); // 3
  }
}
