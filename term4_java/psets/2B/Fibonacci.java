public class Fibonacci {

  private int[] data;
  private int max;
  private int calls;

  Fibonacci(int max) {
    this.max = max;
    data = new int[this.max];
    data[0] = 0;
    data[1] = 1;
  }

  public int getFibonacciNumber(int n) {
    calls = 0;
    if (n >= this.max) {
      return -1;
    }
    return fibRecursive(n);
  }

  private int fibRecursive(int n) {
    calls += 1;
    if (n == 0 | n == 1) {
      return data[n];
    } else {
      if (data[n] != 0) {
        return data[n];
      } else {
        data[n] = fibRecursive(n - 1) + fibRecursive(n - 2);
        return data[n];
      }
    }
  }

  public int getCalls() {
    return this.calls;
  }

  public int[] getData() {
    return this.data;
  }
}
