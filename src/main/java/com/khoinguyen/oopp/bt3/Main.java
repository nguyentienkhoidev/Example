package com.khoinguyen.oopp.bt3;

public class Main {

  public static void main(String[] args) {
//    HinhVuong hinhVuong = new HinhVuong(6);
//    System.out.println(hinhVuong.tinhDienTich());
//    System.out.println(hinhVuong.tinhChuVi());

    //hinh vuong la chu nhat
    HinhChuNhat h = new HinhVuong(6);
    //ép kiểu
    HinhVuong h2 = (HinhVuong) h; //upcasting
    h2.hinhVuongx();

    HinhChuNhat hcn = (HinhChuNhat) h2;

  }

  //tinh đa hình, tính đóng ggí, kế thừa => bài tập
  // tính trìu tượng: interace, abstract
}
