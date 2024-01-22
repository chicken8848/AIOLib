public class binaryToDecimal {
  public static void main(String[] args) {
    binaryToDecimal("1011");
    binaryToDecimal("0");
  }

  static int binaryToDecimal(String args) {
    String[] c = args.split("");
    int bits = c.length;
    int sum = 0;
    for (int i = 0; i < bits; i++) {
      int bit = bits - i - 1;
      sum += Integer.parseInt(c[bit]) * Math.pow(2, i);
    }
    System.out.println(sum);
    return sum;
  }
}
