public class termsRequired {
  public static void main(String[] args) {
    System.out.println(termsRequired(0.9));
  }

  static int termsRequired(double p) {
    double goal = (p * Math.PI * Math.PI) / 6;
    double summy = 0;
    int i = 0;
    while (summy < goal) {
      i++;
      summy += 1 / (Math.pow(i, 2));
    }
    return i;
  }
}
