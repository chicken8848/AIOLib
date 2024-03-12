import java.math.BigDecimal;

public class equals {
  public static void main(String[] args) {

    BigDecimal b1 = new BigDecimal("1.23");
    BigDecimal b2 = new BigDecimal("1.23");
    BigDecimal b3 = b1;

    System.out.println(b1 == b2);
    System.out.println(b1.equals(b2));
    System.out.println(b1 == b3);

    String s1 = "pikachu";
    String s2 = "pikachu";
    String s3 = new String("pikachu");

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
  }
}
