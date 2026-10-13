package com.khoinguyen.default_method;

public interface InterfaceB {
  default void hello() {
    System.out.println("Hello from B");
  }
}
