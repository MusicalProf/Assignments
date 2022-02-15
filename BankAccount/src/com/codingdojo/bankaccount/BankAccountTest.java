package com.codingdojo.bankaccount;

public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount();

    // System.out.println(BankAccount.numOfAccounts);

    account1.deposit("Checking", 10000);
    account1.deposit("Savings", 10000);

    account1.withdraw("Checking", 500);
    account1.seeTotalBalance();
  }
}
