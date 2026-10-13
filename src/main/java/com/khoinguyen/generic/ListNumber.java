package com.khoinguyen.generic;

import java.util.ArrayList;
import java.util.List;

public class ListNumber<T extends Number> {
  private List<T> list;

  public ListNumber(List<T> list) {
    this.list = new ArrayList<>(list);
  }

  public List<T> getList() {
    return list;
  }
  public void setList(List<T> list) {
    this.list = list;
  }

  public T add(T value) {
    list.add(value);
    return value;
  }
  //ăn chặn - phần mềm nhà nước

  public T remove(T value) {
    System.out.println("Ban da remove");
    list.remove(value);
    return value;
  }

  //ham moi
  public T addFirst(T value) {
    System.out.println("Ban da them va dau");
    list.set(0, value);
    //

    //

    //
    //
    return value;
  }
}
