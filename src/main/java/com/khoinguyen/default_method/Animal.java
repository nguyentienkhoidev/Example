package com.khoinguyen.default_method;

public interface Animal {
    void eat();
    void sleep();

    default void fly() {
        System.out.println("I am flying");
    }

    default void sleep2() {
      System.out.println("I am sleeping");
    } //sử dung chung mà không cần phải triển khai | dùng riêng thì overrides
    //khong phải cái nào cũng cần thực thi cái info

  static void add(int a, int b) {
    System.out.println("I am adding " + a + " + " + b);
  }
}
