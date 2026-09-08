package com.khoinguyen.bt10;

public class HotelRoom {
  String roomNumber;
  String roomType;
  boolean isBooked;

  public HotelRoom(String roomNumber, String roomType) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.isBooked = false;
    System.out.printf("Phòng %s %s: \n",roomType, roomNumber);
  }

  public double getRoomRate() {
//    switch (roomType) {//JAVA 8 | mới luộn chạy được bản cũ, bản cũ không chạy dc bản mới
//      case "STANDARD":
//        return 400000;
//      case "DELUXE":
//        return 700000;
//      case "VIP":
//        return 1200000;
//    }
//    return 0;

    return switch (roomType) {//JAVA 21 | mới luộn chạy được bản cũ, bản cũ không chạy dc bản mới
      case "STANDARD" -> 400000;
      case "DELUXE" -> 700000;
      case "VIP" -> 1200000;
      default -> 0;
    };
  }//MÁY CÂY TO DÙNG -< LAPTOP 5 CÂN -> LAPTOP 1 CÂN => LAPTOP = TỜ GIẤY

  public boolean checkIn() {
    if(isBooked) {
      System.out.println("Khách check-in: Thất bại!");
      return false;
    }
    else {
      System.out.println("Khách check-in: Thành công!");
      isBooked = true;
      return true;
    }
  }

  public void checkOut(int nights) {
    double roomRate = getRoomRate();
    double totalPrice = roomRate * nights;
    this.isBooked = false;
    System.out.printf("Khách ở %s đêm, check-out: Tổng tiền = %s VND\n", nights, totalPrice);
    System.out.println("Phòng trả về trạng thái TRỐNG.");
  }
}
