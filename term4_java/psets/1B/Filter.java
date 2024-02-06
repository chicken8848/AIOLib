import java.util.*;

public class Filter {

  public static ArrayList seniorFilter(Person[] arr) {
    ArrayList<String> names = new ArrayList<String>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getAge() >= 60) {
        names.add(arr[i].getName());
      }
    }
    return names;
  }
}
