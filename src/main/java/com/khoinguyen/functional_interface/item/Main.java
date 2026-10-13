package com.khoinguyen.functional_interface.item;

import java.util.function.Consumer;

public class Main {

  public static void main(String[] args) {
    MathUtil math = (a, b) -> a + b;
    System.out.println(math.add(10, 20));

    Consumer<String> c = s -> System.out.println(s);
  }
}
