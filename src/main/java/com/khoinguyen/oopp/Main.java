package com.khoinguyen.oopp;

public class Main {

  public static void main(String[] args) {
//    Student s = new Student(1, "khoinguyen", 25);
//    System.out.println("s: "+s);
//    System.out.println(s.getName());
//    s.setName("hainguyen");
//    System.out.println(s.getName());
//
//    //kiểm soát đúng dữ liệu
//    s.setAge(-25);// chặn dữ liệu
//    System.out.println(s.getAge());

    Boy boy = new Boy("12", "nam", "khoi", 4);
    System.out.println(boy.getCountCalavat());
    boy.print();
  }
}
