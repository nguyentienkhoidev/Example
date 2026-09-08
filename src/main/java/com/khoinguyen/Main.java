package com.khoinguyen;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double total = caculateAmount();
    System.out.println(total);
  }

  public static double caculateAmount() {
    double price = 0;
    String discountCode;
    double total = 0;
    Scanner input = new Scanner(System.in);
    do {
      System.out.print("Enter the price: ");
      price = Double.parseDouble(input.nextLine());;

      if (price == 0) {
        System.out.println("Chốt đơn");
        break;
      }

      System.out.print("Enter the discount code: ");
      discountCode = input.nextLine();

      if (discountCode.equals("VIP")) {//equals so sánh với nhau về mawtj giá trị, còn == so sánh về mặt địa chỉ
        total = price * 0.8;
      } else if (discountCode.equals("MEMBER")) {
        total = price * 0.9;
      } else {
        System.out.println("Mã không hợp lệ");
        return 0;
      }
      System.out.println("Total price: " + total);
    }
    while (true);
    return total;
  }

}
