public class TestBaseInteger {
  public static void main(String[] args) {
    BaseInteger case_1 = new BaseInteger("1,0,1,1", 2);
    BaseInteger case_2 = new BaseInteger("5,2,3,1", 6);
    BaseInteger output = case_1.add(case_2, 5);
    System.out.println(case_1.getDecimalValue());
    System.out.println(case_2.getDecimalValue());
    System.out.println(output);
  }
}
