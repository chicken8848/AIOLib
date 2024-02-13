import java.math.BigInteger;

public class Server {
  // DO NOT CHANGE THIS PART OF THE CODE ======================
  private final int[] publicKey = new int[2];
  private final int[] privateKey = new int[2];
  private int p;
  private int q;

  public void setP(int p) {
    this.p = p;
  }

  public void setQ(int q) {
    this.q = q;
  }

  public int[] getPublicKey() {
    return publicKey;
  }

  public int[] getPrivateKey() {
    return privateKey;
  }

  private int computeModInverse(int e, int lambda) {
    for (int d = 1; d < lambda; d++) {
      if (((e % lambda) * (d % lambda)) % lambda == 1) {
        return d;
      }
    }
    return 1;
  }

  private int computeE(int lambda) {
    for (int i = lambda - 1; i > 2; i--) {
      if (lambda % i != 0 && isPrime(i)) {
        return i;
      }
    }
    return 0;
  }

  private boolean isPrime(int a) {
    for (int i = 2; i < a / 2; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }

  // =========================================

  // Start your answer from here onwards
  public void generatePublicPrivateKey() {
    // TODO 1: Compute modulus n
    int n = p * q;
    // TODO 2: Compute lambda λ
    int lambda = lcm(p - 1, q - 1);
    // TODO 3: Compute e
    int e = computeE(lambda);
    // TODO 4: Compute d
    int d = computeModInverse(e, lambda);
    // TODO 5: Set (n,e) as the public key
    publicKey[0] = n;
    publicKey[1] = e;
    // TODO 6: Sset (n,d) as the private key
    privateKey[0] = n;
    privateKey[1] = d;
  }

  public String decryptMessage(BigInteger[] encryptedIntMessage) {
    BigInteger[] decryptedIntMessage = new BigInteger[encryptedIntMessage.length];
    BigInteger exponent = new BigInteger(String.valueOf(this.privateKey[1]));
    BigInteger modulus = new BigInteger(String.valueOf(this.privateKey[0]));
    String message = "";

    // Hint:
    // 1. Decrypt each character of the message. Use .modPow from BigInteger
    // 2. Decrypted character is an ASCII value (integer). Convert to char
    // 3. Concatenate characters into string
    // 4. Return the decrypted string message

    for (BigInteger c : decryptedIntMessage) {
      BigInteger m = c.modPow(exponent, modulus);
      int v = m.intValue();
      char ch = (char) v;
      message += ch;
    }
    return message;
  }

  private int lcm(int a, int b) {
    // Return the least common multiple of a and b
    // lcm(a,b) is |ab| / gcd(a,b)
    int p = a * b;
    if (p < 0) {
      p = p * -1;
    }
    int output = p / gcd(a, b);

    return output; // 0 is a placeholder to be replaced with the actual output
  }

  private int gcd(int a, int b) {
    // Return the greatest common divisor of a and b
    int max;
    int min;
    int temp;
    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }
    while (min != 0) {
      temp = min;
      min = max % min;
      max = temp;
    }
    int output = max;
    return output; // 0 is a placeholder to be replaced with the actual output
  }
}
