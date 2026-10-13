package com.khoinguyen.default_method;

public interface InterfaceA {
  default void hello() {
    System.out.println("Hello from A");
  }
}
