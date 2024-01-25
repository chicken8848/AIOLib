public class primeNumberChecker {
  public static void main(String[] args) {

    System.out.println(primeChecker(1));
    System.out.println(primeChecker(2));
    System.out.println(primeChecker(3));

    System.out.println(primeChecker(4));
    System.out.println(primeChecker(7));
    System.out.println(primeChecker(14));
    System.out.println(primeChecker(23));
    System.out.println(primeChecker(99));
  }

  public static int primeChecker(int num) {
    if (num % 2 == 0 || num == 1) {
      return 0;
    }
    for (int i = 3; i < Math.sqrt(num); i += 2) {
      if (num % i == 0) {
        return 0;
      }
    }
    return 1;
  }
}
