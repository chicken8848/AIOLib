public class sumIntArrayTwenty {
  public static void main(String[] args) {
    int a[] = {-12, 3, 20, 21, -15, 22};

    int b[] = {};

    sumIntArrayTwenty(a);
    sumIntArrayTwenty(b);
  }

  public static int sumIntArrayTwenty(int[] n) {
    int i = 0;
    for (int j = 0; j < n.length; j++) {
      if (n[j] > 20) {
        i += n[j];
      }
    }
    System.out.println(i);
    return i;
  }
}
