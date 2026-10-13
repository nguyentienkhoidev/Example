package com.khoinguyen.functional_interface;

@FunctionalInterface
public interface Greeting {// chưa hoàn thiên : tại có vì có hàm chua triển khai
  void sayHello(String name);

  default void sayBye() { System.out.println("Bye!"); }   // OK, default method
  static void info() { System.out.println("Greeting v1"); } // OK, static method
}
