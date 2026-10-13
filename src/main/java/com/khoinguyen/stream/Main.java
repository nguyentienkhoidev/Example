package com.khoinguyen.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
//    List<VneId> list = List.of(
//        new VneId("035200001111", "Lan", "Female"),
//        new VneId("001201002222", "Hùng", "Male"),
//        new VneId("079202003333", "Mai", "Female"),
//        new VneId("048199004444", "Tuấn", "Male"),
//        new VneId("038203005555", "Hoa", "Female")
//    );
//
//    //thêm thằng có 038203005555 là từ chối
//    //lơi dụng key của thằng map
//
//    Map<String, VneId> vneIdMap = list.stream().collect(
//        Collectors.toMap(
//            VneId::getCccd,
//            Function.identity()
//        )
//    );
//
//    //validate email trùng
//    String cccdNew = "038203005555";
//    if(vneIdMap.containsKey(cccdNew)) {
//      System.out.println("trung roi");
//    }
//    else {
//      //...
//      System.out.println("ngon");
//    }

    Stream<String> s = List.of("a", "b").stream().map(String::toUpperCase);
    s.forEach(System.out::println);

    //1 2 3 4....100 => chẵn => x2


  }
}
