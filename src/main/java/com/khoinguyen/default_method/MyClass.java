package com.khoinguyen.default_method;

public class MyClass implements InterfaceA, InterfaceB {

  @Override
  public void hello() {
    InterfaceA.super.hello();
  }
}
