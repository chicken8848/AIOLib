public class iterating {
  public static void main(String[] args) {
    int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] c = {1, 2, 3, 4, 5};
    int result = sumall(c);
    int result2 = sumall2(d);
    System.out.println("iterating with for loop over 1 - 5");
    System.out.println(result);
    System.out.println("iterating with for-each loop over 1 - 10");
    System.out.println(result2);
  }

  public static int sumall(int[] args) {
    int result = 0;
    for (int i = 0; i < args.length; i++) {
      result += args[i];
    }
    return result;
  }

  public static int sumall2(int[] args) {
    int result = 0;
    for (int i : args) {
      result += i;
    }
    return result;
  }
}
