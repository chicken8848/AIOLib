import java.util.*;

public class BaseInteger {

  private String representation;
  private int base;

  private int[] digits;
  private int decimalValue;

  BaseInteger(String representation, int base) {
    this.representation = deleteSpaces(representation);
    this.base = base;
    convertRepresentationToArray();
    setDecimalValue();
  }

  private void convertRepresentationToArray() {
    String[] temp_array = representation.split("");
    ArrayList<String> valid_inp = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      valid_inp.add(String.valueOf(i));
    }
    int j = 0;
    this.digits = new int[representation.length()];
    for (int i = 0; i < representation.length(); i++) {
      if (valid_inp.contains(temp_array[i])) {
        this.digits[j] = Integer.parseInt(temp_array[i]);
      }
    }
  }

  private void setDecimalValue() {
    this.decimalValue = 0;
    for (int i = 0; i < digits.length; i++) {
      this.decimalValue += this.digits[digits.length - i] * Math.pow(base, i);
    }
  }

  public int getDecimalValue() {
    return decimalValue;
  }

  public String getDigitsString() {
    return this.digits.toString();
  }

  public BaseInteger add(BaseInteger other, int base) {
    int new_decimal = this.decimalValue + other.decimalValue;
    String rep = convertBase(new_decimal, base);
    BaseInteger output = new BaseInteger(rep, base);
    return output;
  }

  private String convertBase(int decimalValue, int base) {
    Deque<Integer> stored_rem = new LinkedList<Integer>();
    int result = decimalValue;
    int rem;
    while (result != 0) {
      rem = result % base;
      stored_rem.addFirst(rem);
      result = Math.floorDiv(result, base);
    }
    return stored_rem.toString();
  }

  private String deleteSpaces(String representation) {
    String[] temp = representation.split(" ");
    return temp.toString();
  }

  @Override
  public String toString() {
    return representation + " Base " + base;
  }
}
