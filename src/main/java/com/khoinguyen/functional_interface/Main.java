package com.khoinguyen.functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {
    //Level 1
    Greeting dog = new Dog();
    dog.sayHello("dog");

    //meo say hello -> meo
    //1000 nói hello -> 1000 class con vật -> gọi 1000 lần hello
    // không cần tạo class mà cũng có dùng ngay được

    //Level 2 => triển khai thằng con thiếu
    Greeting duck = new Greeting() {//anonymous function
      @Override
      public void sayHello(String name) {
        System.out.println("Hello xxxxx " + name);
      }
    };
    duck.sayHello("duck");

    //Level 3: lambda expression
    Greeting elephant = (name) -> { System.out.println("Elephant ffff" + name); };
    elephant.sayHello("elephant");

    //Level 4:
    Greeting cat = name -> System.out.println("Cat " + name);
    cat.sayHello("cat");

    //cho so n => xem so do co chia het cho 2 hay ko

    Predicate<Integer> isEven = n -> n % 2 == 0; //cho đi và nhận lại đúng hay sai
    System.out.println(isEven.test(3));

    // Consumer<T>: Nhận T → Không trả về gì (void) //cho đi nhưng không nhận lại
    Consumer<String> printer = s -> System.out.println("Xin chào " + s);//log giá trị
    printer.accept("Khôi"); // "Xin chào Khôi"

    Function<String, Integer> getLength = s -> s.length();
    System.out.println(getLength.apply("Java")); // 4

    //binh phuong 1 so
//    Function<Integer, Integer> square = a -> a * a; => cho đi và nhận lại
//    System.out.println(square.apply(10));

    // Supplier<T>: Không nhận gì → Trả về T // không cho mà nha
//    Supplier<Double> randomNumber = () -> Math.random();
//    System.out.println(randomNumber.get()); // 0.7856...
//
//    Supplier<Double> pi = () -> Math.PI;
//    System.out.println(pi.get());

    Function<String, Integer> parser = Integer::parseInt;
    System.out.println(parser.apply("5000"));
  }
}
