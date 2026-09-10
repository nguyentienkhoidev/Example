package com.khoinguyen.bt10.bai6;

public class Bai6 {
  public static void swap(Point p1, Point p2) {
    System.out.println("in function p1 = "+p1+" p2 = "+p2);
    Point temp = p1;
    p1 = p2;
    p2 = temp;
    p2.x = 1000;
    // Hàm không thực sự đổi vì sau khi khi kết thúc hàm này tất cả các giá trị bên trong sẽ biến mất
  }

  public static void reset(Point p) {
    p.x = 0;
    p.y = 0;
  }

  public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(7, 8);

    System.out.println("Trước khi swap: ");
//    System.out.println("P1 = (" + p1.x + ", " + p1.y + ")");
//    System.out.println("p2 = (" + p2.x + ", " + p2.y + ")");

    System.out.println("p1: "+p1);
    System.out.println("p2: "+p2);

    swap(p1,p2);

    System.out.println("Sau khi swap: ");
    System.out.println("p1 = ( " + p1.x + " , "+ p1.y +")");
    System.out.println("p2 = ( " + p2.x + " , "+ p2.y +")");
    System.out.println("p1: "+p1);
    System.out.println("p2: "+p2);

    reset(p1);

    System.out.println("Sau Reset: ");
    System.out.println("P1 = (" + p1.x +" , "+ p1.y +")");
  }
}
