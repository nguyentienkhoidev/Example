package com.khoinguyen.bankApp;

import java.util.Scanner;

public class BankAppV1 {
  public static void main(String[] args) {
    login();
  }

  // đăng nhập
  public static void login() {
    int count = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("=============== Welcome to Login ===============");
    while (true) {
      System.out.print("Input Admin: ");
      String adminPin = sc.nextLine();

      if(adminPin.equals("1234")) {
        break;
      }
      else {
        count++;
      }

      if(count > 3) {
        System.out.println("Invalid Admin Input");
        return;
      }
    }
    app();
  }

  public static void app() {
    double balance = 10000;
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("=============== Welcome to Bank App ===============");
      System.out.println("1. Withdraw Money");// rút tiền thẻ tại atm (trừ tiền account) - rút tiền từ tài khoản khác
      System.out.println("2. Transfer Money");
      System.out.println("3. View Account Balance");
      System.out.println("4. To up");
      System.out.println("5. Logout");

      System.out.print("Input function: ");
      String choice = sc.nextLine();
      switch (choice) {
        case "1":
          System.out.print("Enter amount to withdraw: ");
          double amount = Double.parseDouble(sc.nextLine());
          if(amount > balance) {
            System.out.println("Insufficient Balance");
            break;
          }
          balance = balance - amount;
          viewBalance(balance);
          break;
        case "2":
          System.out.print("Enter amount to transfer: ");
          double transferMoney = Double.parseDouble(sc.nextLine());
          if(transferMoney > balance) {
            System.out.println("Insufficient Balance");
            break;
          }
          balance = balance - transferMoney;
          viewBalance(balance);
          break;
        case "3":
          System.out.println("View Account Balance: "+balance);
          break;
        case "4":
          System.out.print("Enter money to up: ");
          double upMoney = Double.parseDouble(sc.nextLine());
          balance = balance + upMoney;
          viewBalance(balance);
          break;
        case "5":
          System.out.println("Logout");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice. You should enter 1-5");
          break;
      }
    }
  }

  public static void viewBalance(double balance) {
    System.out.println("Your balance is "+balance);
  }
}
