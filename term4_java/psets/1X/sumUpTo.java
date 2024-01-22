public class sumUpTo {
  public static void main(String[] args) {
    int output = sumUpTo(9);
    System.out.println(output);
  }

  public static int sumUpTo(int n) {
    int i = 0;
    for (int j = 0; j < n + 1; j++) {
      i += j;
    }
    return i;
  }
}
