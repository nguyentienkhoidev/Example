package com.khoinguyen.bt10;

public class Product {
  String productId;
  String productName;
  double importPrice;
  double sellingPrice;

  public Product() {
  }

  public Product(String productId, String productName, double importPrice, double sellingPrice) {
    this.productId = productId;
    this.productName = productName;
    this.importPrice = importPrice;
    this.sellingPrice = sellingPrice;
  }

  public double calculateProfit() {
    return sellingPrice - importPrice;
  }

  public String evaluateMargin() {
    //thu gom
    String message = "";
    double profit = calculateProfit();
    if(profit > 500000) {
      message = "Siêu Lợi Nhuận";
    }
    else if(profit >= 100000 && profit <= 500000) {
      message = "Lợi Nhuận Tốt";
    }
    else if(profit > 0 && profit < 100000) {
      message = "Lợi Nhuận Thấp";
    }
    else {
      message = "Hòa vốn hoặc Lỗ";
    }
    return message;
  }

  public void printProduct() {
    double profit = calculateProfit();
    String evaluation = evaluateMargin();
    System.out.printf("Mã: %s | Tên: %s | Lãi: %s VND | Đánh giá: %s", this.productId, this.productName, profit, evaluation);
  }
}
