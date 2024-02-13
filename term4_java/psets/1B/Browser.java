import java.math.BigInteger;

public class Browser {
  private final int[] publicKey = new int[2]; // DO NOT CHANGE THIS DATA FIELD

  public void establishConnection(Server s) {
    // TODO 1: Generating public and private key by the server
    // TODO 2: Get the public key from the server and use it to set Browser object's public key
    s.generatePublicPrivateKey();
    publicKey[0] = s.getPublicKey()[0];
    publicKey[1] = s.getPublicKey()[1];
  }

  public BigInteger[] encryptMessage(String message) {
    BigInteger[] encryptedIntMessage = new BigInteger[message.length()];
    char[] m = new char[message.length()];
    message.getChars(0, message.length(), m, 0);
    BigInteger exponent = new BigInteger(String.valueOf(this.publicKey[1]));
    BigInteger modulus = new BigInteger(String.valueOf(this.publicKey[0]));
    System.out.println(modulus);

    // Hint:
    // 1. Loop through each character of the message
    // 2. Convert to its ASCII value in integer
    // 3. Encrypt the value. Use .modPow method from BigInteger
    for (int i = 0; i < message.length(); i++) {
      int k = (int) m[i];
      encryptedIntMessage[i] = new BigInteger(String.valueOf(k)).modPow(exponent, modulus);
    }

    return encryptedIntMessage;
  }
}
