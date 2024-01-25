import java.util.*;

public class iterating {
  public static void main(String[] args) {
    ArrayList<Integer> d = new ArrayList<Integer>();
    for (int i = 0; i < 11; i++) {
      d.add(i);
    }
    ArrayList<Integer> c = new ArrayList<Integer>();
    for (int i = 0; i < 6; i++) {
      c.add(i);
    }
    int result = sumall(c);
    int result2 = sumall2(d);
    System.out.println("iterating with for loop over 1 - 5");
    System.out.println(result);
    System.out.println("iterating with for-each loop over 1 - 10");
    System.out.println(result2);
  }

  public static int sumall(ArrayList<Integer> args) {
    int result = 0;
    Iterator<Integer> it = args.iterator();
    while (it.hasNext()) {
      result += it.next();
    }
    return result;
  }

  public static int sumall2(ArrayList<Integer> args) {
    int result = 0;
    for (int i : args) {
      result += i;
    }
    return result;
  }
}
