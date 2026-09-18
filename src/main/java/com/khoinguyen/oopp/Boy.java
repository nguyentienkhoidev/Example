package com.khoinguyen.oopp;

public class Boy extends People {//company
  //Con trai là người
  private int countCalavat;

  public Boy() {}

  public Boy(String age, String gender, String name, int countCalavat) {
    super(age, gender, name);
    this.countCalavat = countCalavat;
  }

  public int getCountCalavat() {
    return countCalavat;
  }

  public void setCountCalavat(int countCalavat) {
    this.countCalavat = countCalavat;
  }

  public void print() {
    System.out.println(name);
  }

  //thằng con cùa thằng people => boy cũng sử dụng được (con của cha)
}
