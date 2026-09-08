package com.khoinguyen.bankApp;

import java.util.Scanner;

public class BankAppV2 {
  public static final String PASSWORD = "1234";
  public static final double BALANCE = 10000;
  public static final String WITHDRAW = "1";
  public static final String TRANSFER = "2";
  public static final String VIEW_BALANCE = "3";
  public static final String TOP_UP = "4";
  public static final String LOGOUT = "5";
  public static final int MAX_FAIL_LOGIN_TIMES = 3;

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

      if(adminPin.equals(PASSWORD)) {
        break;
      } else count++;


      if(count > MAX_FAIL_LOGIN_TIMES) {
        System.out.println("Invalid Admin Input");
        return;
      }
    }
    app();
  }

  public static void app() {
    double balance = BALANCE;
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("=============== Welcome to Bank App ===============");
      System.out.println("1. Withdraw Money");
      System.out.println("2. Transfer Money");
      System.out.println("3. View Account Balance");
      System.out.println("4. To up");
      System.out.println("5. Logout");

      System.out.print("Input function: ");
      String choice = sc.nextLine();
      switch (choice) {
        case WITHDRAW:
          System.out.print("Enter amount to withdraw: ");
          double amount = Double.parseDouble(sc.nextLine());
          //check transfer greater than balance
          if(amount > balance) {
            System.out.println("Insufficient Balance");
            break;
          }
          balance = balance - amount;
          viewBalance(balance);
          break;
        case TRANSFER:
          System.out.print("Enter amount to transfer: ");
          double transferMoney = Double.parseDouble(sc.nextLine());
          if(transferMoney > balance) {
            System.out.println("Insufficient Balance");
            break;
          }
          balance = balance - transferMoney;
          viewBalance(balance);
          break;
        case VIEW_BALANCE:
          System.out.println("View Account Balance: "+balance);
          break;
        case TOP_UP:
          System.out.print("Enter money to up: ");
          double upMoney = Double.parseDouble(sc.nextLine());
          balance = balance + upMoney;
          viewBalance(balance);
          break;
        case LOGOUT:
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
