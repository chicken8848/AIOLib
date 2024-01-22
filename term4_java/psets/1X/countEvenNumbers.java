public class countEvenNumbers {
  public static void main(String[] args) {
    int a[] = {-12, 3, 0, 21, -15, 2};
    int b[] = {};
    countEvenNumbers(a);
    countEvenNumbers(b);
    int c[] = {2, 3, 9, 5, 4, 1, 1};
    countEvenNumbers(c);
  }

  public static int countEvenNumbers(int[] args) {
    int output = 0;
    for (int i : args) {
      if (i % 2 == 0) {
        output++;
      }
    }
    System.out.println(output);
    return output;
  }
}
