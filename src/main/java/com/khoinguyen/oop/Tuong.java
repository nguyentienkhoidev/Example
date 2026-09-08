package com.khoinguyen.oop;

public class Tuong {
  String ten;
  String tay;
  String bung;
  String chan;

  public Tuong() {

  }

  public Tuong(String tay) {
    this.tay = tay;
  }

  public Tuong(String tay, String bung) {// constructor có thể đẩy data tùy theo tham số và nội tại class
    this.tay = tay;
    this.bung = bung;
  }

  public Tuong(String ten, String tay, String bung, String chan) {// constructor có thể đẩy data tùy theo tham số và nội tại class
    this.tay = tay;
    this.bung = bung;
    this.ten = ten;
    this.chan = chan;
  }

  //method: hành vi
  public void dungYen() {
    System.out.println("tuong "+ten+ " dang dung yen");
  }

  public void ban() {
    System.out.println("tuong "+ten+ " ban dang ban");
  }

  public static void main(String[] args) {
    // Khởi tạo đối tượng thông qua constructors
    // đổ đồng vào phễu
    Tuong tuongDong = new Tuong("phap su", "dong tay", "bung", "chan");
    tuongDong.ban();

    Tuong tuongMoi = new Tuong("quan", "tay to", "bung beo", "chan to");
    tuongMoi.dungYen();
  }
}
