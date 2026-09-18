package com.khoinguyen.oopp;

public class People {
  private String age;
  private String gender;
  protected String name;

  public People() {}

  public People(String age, String gender, String name) {
    this.age = age;
    this.gender = gender;
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void go() {
    System.out.println("go");
  }
}
