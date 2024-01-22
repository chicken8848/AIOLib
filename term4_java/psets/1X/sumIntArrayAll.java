public class sumIntArrayAll {
  public static void main(String[] args) {
    int a[] = {-12, 3, 20, 21, -15, 2};
    int b[] = {};
    int c[] = new int[10];

    sumIntArrayAll(a);
    sumIntArrayAll(b);
    sumIntArrayAll(c);
  }

  public static int sumIntArrayAll(int[] n) {
    int i = 0;
    for (int j = 0; j < n.length; j++) {
      i += n[j];
    }
    System.out.println(i);
    return i;
  }
}
