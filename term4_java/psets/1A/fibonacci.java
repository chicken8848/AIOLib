import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Input number for fibonacci");
    String input = myObj.nextLine();
    int num = Integer.parseInt(input);
    int result = fibonacci(num);
    System.out.println(result);
  }

  public static int fibonacci(int args) {
    if (args == 1 || args == 2) {
      return 1;
    } else {
      return fibonacci(args - 1) + fibonacci(args - 2);
    }
  }
}
;
