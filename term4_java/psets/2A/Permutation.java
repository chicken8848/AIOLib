import java.util.*;

public class Permutation {
  private final String in;
  private ArrayList<String> a = new ArrayList<String>();

  Permutation(final String str) {
    in = str;
  }

  public void permute() {
    int r = in.length() - 1;
    int l = 0;
    permuter(in, l, r);
  }

  public ArrayList<String> getA() {
    return a;
  }

  public String swap(String a, int i, int j) {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }

  private void permuter(String str, int l, int r) {
    if (l == r) {
      a.add(str);
    } else {
      for (int i = l; i <= r; i++) {
        str = swap(str, l, i);
        permuter(str, l + 1, r);
        str = swap(str, l, i);
      }
    }
  }
}
