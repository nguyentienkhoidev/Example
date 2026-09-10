package com.khoinguyen.bt10.bai7;

public class Main {
  public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
    return null;
  }

  public static void main(String[] args) {
    ComplexNumber z1 = new ComplexNumber(3.0, 2.0);
    ComplexNumber z2 = new ComplexNumber(1.0, 4.0);

    ComplexNumber z = z1.add(z2);
    z.print();
  }
}
