public class PalindromeTest {
  public static void main(String[] args) {
    char[] x = {'a', 'b', 'b', 'a'};
    System.out.println(Palindrome.isPalindrome(x));
    char[] y = {'Z', 'Z', 'b', 'Z', 'Z'};
    System.out.println(Palindrome.isPalindrome(y));
    char[] z = {'1', '2', '3', '4', '1'};
    System.out.println(Palindrome.isPalindrome(z));
  }
}
