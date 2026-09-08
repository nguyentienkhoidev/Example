package com.khoinguyen.bt10;

public class Main {

  public static void main(String[] args) {
    // ===================== Ex1 =====================
    /*
    Square square1 = new Square();//contructor
    square1.name = "Hình Vuông 1";
    square1.side = 10;
    square1.displayInfo();

    Square square2 = new Square(6.5);
    square2.name = "Hình Vuông 2";
    square2.displayInfo();

    Square square3 = new Square(-5);
    square3.name = "xxxx";
    square3.displayInfo();
     */

//    Product product1 = new Product("SP01", "Tai nghe Bluetooth", 500000, 700000);
//    product1.printProduct();

    // ===================== Ex2 =====================
    /*
    Product product = new Product();
    product.productId = "SP01";
    product.productName = "Tai nghe Bluetooth";
    product.importPrice = 500000;
    product.sellingPrice = 700000;
    product.printProduct();
    */

    // ===================== Ex3 =====================
    /*
    Smartphone smartphone = new Smartphone("Apple", "Iphone 17", 34000000, 128);
    smartphone.display();
    smartphone.upgradeStorage(128, 3000000);
    System.out.println("Sau nâng cấp: ");
    smartphone.display();
     */

    // ===================== Ex10 =====================
    HotelRoom hotelRoom = new HotelRoom("R1", "DELUXE");
//    hotelRoom.isBooked = true;// giả lập thằng khác book mất
    boolean checkIn = hotelRoom.checkIn();
    if (checkIn) {
      hotelRoom.checkOut(5);
    }

  }
}
