import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Input number for fibonacci");
    String input = myObj.nextLine();
    int num = Integer.parseInt(input);
    String result = list_fibonacci(num);
    System.out.println(result);
  }

  public static int fibonacci(int args) {
    if (args == 1 || args == 2) {
      return 1;
    } else {
      return fibonacci(args - 1) + fibonacci(args - 2);
    }
  }

  public static String list_fibonacci(int args) {
    int[] c = new int[args + 1];
    c[0] = 0;
    for (int i = 1; i < args + 1; i++) {
      c[i] = fibonacci(i);
    }
    String message = "";
    for (int num : c) {
      message = message + num + ",";
    }
    return message.substring(0, message.length() - 1);
  }
}
;
