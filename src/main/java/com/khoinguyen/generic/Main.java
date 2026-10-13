package com.khoinguyen.generic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    Calculation<Double> calculation = new Calculation<Double>(5.6555555555, 5.5);
////    System.out.println(calculation.add());
//
//    //Number : cha của mọi kiểu số: Double, Float, Integer
//
//    HashMapLib<Integer, Double> map = new HashMapLib<>(4, 6.6);
////    System.out.println(map.add());
//    //tự quyết định được kiểu dữ liệu
//
////    ArrayList<Integer> list1 = new ArrayList<>();
////    list1.add(1);
//
//    //List riêng anh//Object
//    ListNumber<Integer> list = new ListNumber<>(List.of());
//    System.out.println(list.add(1));
//    System.out.println(list.add(2));
//    System.out.println(list.getList());
//    System.out.println(list.addFirst(3));
//    System.out.println(list.getList());
    //linh hoạt cho mình
    //modify/ xử lí đc nhiều

    List<Animal> dogs = new ArrayList<>();
    dogs.add(new Dog());

    addAnimal1(dogs);
//    addAnimal2(dogs);

  }

  //List<? super Animal> animals: ? là cha của Animal
  public static void addAnimal1(List<? super Animal> animals) {

  }

  //? là con của Animal
  public static void addAnimal2(List<? extends Dog> animals) {

  }
}
