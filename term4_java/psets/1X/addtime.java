public class addtime {
  public static void main(String[] args) {
    addTime(0, 20, 0, 30);
    addTime(0, 40, 0, 30);
    addTime(1, 30, 1, 31);
    addTime(6, 30, 4, 45);
  }

  public static int[] addTime(int hour1, int min1, int hour2, int min2) {
    int hour = hour1 + hour2;
    int min = min1 + min2;
    if (min > 60) {
      hour += min / 60;
      min = min % 60;
    }
    int[] result = {hour, min};
    System.out.println(result[0] + " hours " + result[1] + " minutes");
    return result;
  }
}
