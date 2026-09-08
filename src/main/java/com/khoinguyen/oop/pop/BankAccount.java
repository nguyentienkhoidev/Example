package com.khoinguyen.oop.pop;

import java.sql.SQLOutput;

public class BankAccount {
  String accountName;
  double balance;
  boolean active;

  public BankAccount(String accountName, double balance, boolean active) {
    this.accountName = accountName;
    this.balance = balance;
    this.active = active;
  }

  public void rutTien(double money) {
    this.balance = this.balance - money;
    System.out.printf("Ban vua rut: %s dong, tai khoan %s con lai: %s", money, accountName, this.balance);
  }

  public static void main(String[] args) {
//    BankAccount bankAccount = new BankAccount("TK1", 10000, true);
//    System.out.println("acc: "+bankAccount);
//    bankAccount.rutTien(1000);
//    bankAccount.rutTien(2000);
//
//    BankAccount bankAccount2 = new BankAccount("TK2", 20000, false);
//    bankAccount2.rutTien(3000); // bản vẽ đúng mới mọi trường hợp => truyền data vào thôi

//    BankAccount bankAccount1 = new BankAccount("TK1", 10000, true);
//    BankAccount bankAccount2 = new BankAccount("TK2", 10000, true);
//    System.out.println("Account name 2: "+bankAccount2.accountName);
//    BankAccount bankAccount3 = bankAccount2;
//    bankAccount3.accountName = "TK3";
//
//    System.out.println("Account name 3: "+bankAccount3.accountName);
//    System.out.println("=======");
//    System.out.println("Account name 2: "+bankAccount2.accountName);
    //cái gì gióng hệt thì mới trỏ còn hơi khác thì new

    BankAccount bankAccount = new BankAccount("Ban vua rut", 1000, true);
    bankAccount.change(bankAccount);
    System.out.println(bankAccount.balance);

//    int x = 100;
//    bankAccount.fun(x);
//    System.out.println(x);


  }

  public void change(BankAccount bankAccount) {
    bankAccount.balance = 1000034343;
  }

  public void fun(int x) {
    x = 5;
  }
}
