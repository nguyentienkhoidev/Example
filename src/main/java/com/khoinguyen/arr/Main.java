package com.khoinguyen.arr;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> nv = new ArrayList<>();
    nv.add(1);
    nv.add(2);
    nv.add(30);
    nv.add(2);
    nv.add(1, 50);
//    nv.remove(2);
    nv.set(1, 4);
    System.out.println(nv);
//    nv.clear();

//    System.out.println(nv.contains(4000));
    for(Integer i : nv) {//for loop
      System.out.println(i);
    }
  }
}
