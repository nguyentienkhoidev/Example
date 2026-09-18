package com.khoinguyen.oopp;

public class Student {
  private int id;
  private String name;
  private int age;
  private int fee;

  public Student() {}

  public Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getFee() {
    return fee;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {//-25
    if(age < 0) {
      System.out.println("Invalid age");
    }
    else {
      this.age = age;
    }
  }

  public void setFee(int fee) {
    this.fee = fee;
  }

  public void show() {
    System.out.println(id + " " + name + " " + age);
  }
}
