import java.util.Date;

public class TestAccount {

  public static void main(String[] args) {
    Account account = new Account(1122, 20000);

    Account.setAnnualInterestRate(4.5);

    account.withdraw(2500);

    account.deposit(3000);

    System.out.println("Balance is " + account.getBalance());

    System.out.println("Monthly interest is " + account.getMonthlyInterest());
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
