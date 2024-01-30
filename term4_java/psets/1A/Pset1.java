import java.util.Arrays;

public class Pset1 {
  public static boolean isAllCharacterUnique(String sIn) {
    String[] arr = sIn.split("");
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i].equals(arr[i + 1])) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPermutation(String sIn1, String sIn2) {
    String[] arr1 = sIn1.split("");
    String[] arr2 = sIn2.split("");
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if (arr1.length != arr2.length) {
      return false;
    }
    for (int i = 0; i < arr1.length; i++) {
      if (!arr1[i].equals(arr2[i])) {
        return false;
      }
    }
    return true;
  }
}
