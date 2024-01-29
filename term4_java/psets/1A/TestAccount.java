import java.util.Date;

public class TestAccount {

  public static void main(String[] args) {

    CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);

    myCheckAcc.deposit(2000);

    myCheckAcc.withdraw(15000);

    System.out.println(myCheckAcc.getBalance());

    myCheckAcc.withdraw(200);

    System.out.println(myCheckAcc.getBalance());

    myCheckAcc.deposit(7000);

    myCheckAcc.withdraw(200);

    System.out.println(myCheckAcc.getBalance());
  }
}

class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private Date dateCreated;

  // no arg constructor
  Account() {
    id = 0;
    balance = 0;
    annualInterestRate = 0;
  }

  // arg constructor
  Account(int x, double y) {
    id = x;
    balance = y;
  }

  Account(int x, double y, double newInterest) {
    id = x;
    balance = y;
    annualInterestRate = newInterest;
  }

  public static void setAnnualInterestRate(double newInterest) {
    annualInterestRate = newInterest;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public double getBalance() {
    return balance;
  }

  public double getMonthlyInterestRate() {
    return annualInterestRate / 12;
  }

  public double getMonthlyInterest() {
    return getMonthlyInterestRate() / 100 * balance;
  }
}

class CheckingAccount extends Account {

  private int id;
  private double balance;
  private static double annualInterestRate;
  private Date dateCreated;

  CheckingAccount() {
    this.id = 0;
    this.balance = 0;
    annualInterestRate = 0;
  }

  // arg constructor
  CheckingAccount(int x, double y) {
    this.id = x;
    this.balance = y;
  }

  CheckingAccount(int x, double y, double newInterest) {
    this.id = x;
    this.balance = y;
    annualInterestRate = newInterest;
  }

  @Override
  public void withdraw(double amount) {
    if (this.balance - amount < 0) {
      System.out.println("over limit");
    } else {
      this.balance = this.balance - amount;
    }
  }
}
