package com.khoinguyen.hash_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
//    Set<Integer> hashSet = new HashSet<>();
//    hashSet.add(1);
//    hashSet.add(2);
//    hashSet.add(3);
//    hashSet.add(4);
//
////    System.out.println(hashSet.isEmpty()); // có rỗng hay k
//    hashSet.clear(); //xóa hết
//    hashSet.add(5);
//    System.out.println(hashSet);

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "khoi");
    map.put(2, "khoi");
    map.put(3, "khoicx");
    map.put(3, "khoicdcdccx");

    System.out.println(map.keySet());
    for (Integer key : map.keySet()) {
      String value = map.get(key);
      System.out.println(key+ " - "+value);
    }

//    List<Integer> list = new ArrayList<>();
//    list.add(1);
//    list.add(2);
//    list.add(3);
//
//    for (Integer item : list) {
//      System.out.println(item);
//    }
  }
}
