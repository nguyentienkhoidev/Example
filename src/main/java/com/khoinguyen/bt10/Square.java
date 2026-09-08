package com.khoinguyen.bt10;

public class Square {
  double side;
  String name;

  public Square() {
    this.side = 1;
  }

  public Square(double side) {
    if (side <= 0) {
      this.side = 1;
    }
    else {
      this.side = side;
    }
  }

  public double calculateArea() {
    return Math.pow(side, 2);
  }

  public double calculatePerimeter() {
    return side * 4;
  }

  public void displayInfo() {
    double area = calculateArea();
    double perimeter = calculatePerimeter();
    System.out.printf("[%s] Cạnh: %s | Chu vi: %s | Diện tích: %s\n", this.name, this.side, perimeter, area);
  }
}
