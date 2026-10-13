package com.khoinguyen.functional_interface;


public class Dog implements Greeting {

  @Override
  public void sayHello(String name) {
    System.out.println("Hello " + name);
  }

  //class không còn gì để triển khai thêm => là class hoàn thiện
}
