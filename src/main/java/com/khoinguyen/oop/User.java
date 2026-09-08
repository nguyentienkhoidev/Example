package com.khoinguyen.oop;

import java.util.Date;

public class User { // Ký tự { bắt đầu Block của lớp User
  // cách thức quản lí|
  double a;

  // Các fields này chính là instance variables || oop: thuộc tính (properties)
  Integer id; // đây là fields
  String firstName; // đây là fields
  String lastName; // đây là fields
  Date dateOfBirth; // đây là fields
  Address address; // đây là fields
  String message; // đây là fields

  // đây là constructor: không đối số
  public User() {
  }

  // đây là constructor có tham số truyền vào // mục đích constructor -> đẩy dữ liệu vào trong thuộc tính
  public User(Integer id, String firstName, String lastName, Date dateOfBirth) {// có đối số - method đặc biệt = constructor
    this.id = id; // nội tại class
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
  }

  public User(Integer id, String firstName, String lastName) {// có đối số // update mật khẩu
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // Nested class (Lớp lồng nhau)
  class Address {
    private String street;
    private String district;
    private String city;
    private String country;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  public static void main(String[] args) {
    //Integer id, String firstName, String lastName, Date dateOfBirth
    System.out.println("Thang An");
    User an = new User(1, "Nguyen", "An", new Date());
    System.out.println(an);

    System.out.println("Thang Ha");
    User ha = new User(2, "Nguyen", "Ha", new Date());
    System.out.println(ha);
  }
} // Ký tự } kết thúc Block của lớp User

// lí thuyết: làm lại bài lí thuyết =))) câu hỏi: oop la gì