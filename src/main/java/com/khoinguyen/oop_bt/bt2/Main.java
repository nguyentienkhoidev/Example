package com.khoinguyen.oop_bt.bt2;

public class Main {

  public static void main(String[] args) {
    NhanVien[] arrNv = new NhanVien[6];
    NhanVien nvf1 = new NhanVienFullTime("hien", 5000, 10000);
    arrNv[0] = nvf1;
    NhanVienFullTime nvf2 = new NhanVienFullTime("khoi", 4000, 11000);
    arrNv[1] = nvf2;
    NhanVienPartTime nvp1 = new NhanVienPartTime("hoang", 4000, 5);
    arrNv[2] = nvp1;
    NhanVienPartTime nvp2 = new NhanVienPartTime("son", 6000, 10);
    arrNv[3] = nvp2;

    //Dem xem co bao nhieu nhan vien part time | fulltime
    int countFullTime = 0;
    int countPartTime = 0;
    for (NhanVien nv : arrNv) {
      if(nv == null) {
        continue;
      }
      nv.hienThiThongTin();
      if(nv instanceof NhanVienFullTime) {
        countFullTime++;
      }
      if(nv instanceof NhanVienPartTime) {
        countPartTime++;
      }
    }
  }
}
