package com.khoinguyen.bt10;

public class Smartphone {
  String brand;
  String model;
  double price;
  int storageGB;

  public Smartphone(String brand, String model, double price, int storageGB) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.storageGB = storageGB;
    System.out.println("Khởi tạo: ");
  }

  public Smartphone(String brand, String model, double price) {
    this(brand, model, price, 128);
    System.out.println("Khởi tạo: ");
  }

  public Smartphone() {
    this("iphone", "17 promax", 0, 0);
    System.out.println("Khởi tạo: ");
  }

  public void upgradeStorage(int extraGB, double upgradeFee){
    storageGB += extraGB;
    price += upgradeFee;
    System.out.printf("Nâng cấp thêm %s GB (+ %s VND)...\n", extraGB, upgradeFee);
  }

  public void display() {
    System.out.printf("%s | %s | %s GB | %s VND\n", model, brand, storageGB, price);
  }
}
