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
    String[] temp_array = this.representation.split("");
    ArrayList<String> valid_inp = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      valid_inp.add(String.valueOf(i));
    }
    int j = 0;
    this.digits = new int[representation.length() / 2 + 1];
    for (int i = 0; i < representation.length(); i++) {
      if (valid_inp.contains(temp_array[i])) {
        this.digits[j] = Integer.parseInt(temp_array[i]);
        j++;
      }
    }
  }

  private void setDecimalValue() {
    this.decimalValue = 0;
    for (int i = 0; i < digits.length; i++) {
      this.decimalValue += this.digits[this.digits.length - i - 1] * Math.pow(base, i);
    }
  }

  public int getDecimalValue() {
    return decimalValue;
  }

  public String getDigitsString() {
    return Arrays.toString(this.digits);
  }

  public BaseInteger add(BaseInteger other, int base) {
    int new_decimal = this.decimalValue + other.decimalValue;
    String rep = convertBase(new_decimal, base);
    System.out.println(rep);
    BaseInteger output = new BaseInteger(rep, base);
    return output;
  }

  private String convertBase(int decimalValue, int base) {
    ArrayList<Integer> stored_rem = new ArrayList<Integer>();
    int result = decimalValue;
    int rem;
    while (result != 0) {
      rem = result % base;
      stored_rem.add(0, rem);
      result = Math.floorDiv(result, base);
      System.out.println(showinString(stored_rem));
    }
    return showinString(stored_rem);
  }

  private String deleteSpaces(String representation) {
    String[] temp = representation.split(" ");
    return String.join(",", temp);
  }

  public String getRepresentation() {
    return this.representation;
  }

  @Override
  public String toString() {
    return representation + " Base " + base;
  }

  private String showinString(ArrayList<Integer> args) {
    String output = "";
    for (int i : args) {
      output = output + Integer.toString(i) + ",";
    }
    return output.substring(0, output.length() - 1);
  }
}
