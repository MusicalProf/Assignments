package com.codingdojo.bankaccount;

public class BankAccount {
  private static int ID = 1000;
  private double checkingBal, savingsBal;
  public static int numOfAccounts;
  public static double totalBalance;
  private String accountNumber;

  // Getters
  public double getCheckingBal() {
    return checkingBal;
  }

  public double getSavingsBal() {
    return savingsBal;
  }

  private String newAccountNum() {
    int random = (int) (Math.random() * 1000000);
    accountNumber = ID + "" + random;
    return accountNumber;
  }

  public BankAccount() {
    numOfAccounts++;
    ID++;
    System.out.println("You have created an account. Your new account number is: " + newAccountNum());
  }

  public void deposit(String account, double amount) {
    if (account.equals("Checking")) {
      checkingBal += amount;
      totalBalance += amount;
      System.out.println("Your deposit is complete. Your new balance is: $" + checkingBal);
    } else if (account.equals("Savings")) {
      savingsBal += amount;
      totalBalance += amount;
      System.out.println("Your deposit is complete. Your new balance is: $" + savingsBal);
    }
  }

  public void withdraw(String account, double amount) {
    if (account.equals("Checking")) {
      if (checkingBal < 0 || checkingBal == 0) {
        System.out.println("Account has insufficient funds. Transaction cannot be completed.");
      } else {
        checkingBal -= amount;
        totalBalance -= amount;
        System.out.println("Your transaction is complete. Your new balance is: $" + checkingBal);
      }
    } else if (account.equals("Savings")) {
      if (savingsBal < 0 || savingsBal == 0) {
        System.out.println("Account has insufficient funds. Transaction cannot be completed.");
      } else {
        savingsBal -= amount;
        totalBalance -= amount;
        System.out.println("Your transaction is complete. Your new balance is: $" + savingsBal);
      }
    }
  }

  public double seeTotalBalance() {
    totalBalance = checkingBal + savingsBal;
    System.out.println("Your current total balance across all accounts is: $" + totalBalance);
    return totalBalance;
  }
}
