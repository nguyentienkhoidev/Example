package com.khoinguyen.oop_bt.bt1;

public class Sach extends TaiLieu {
  private String tenTacGia;
  private int soTrang;

  public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
    this.tenTacGia = tenTacGia;
    this.soTrang = soTrang;
  }

  public String getTenTacGia() {
    return tenTacGia;
  }

  public void setTenTacGia(String tenTacGia) {
    this.tenTacGia = tenTacGia;
  }

  public int getSoTrang() {
    return soTrang;
  }

  public void setSoTrang(int soTrang) {
    this.soTrang = soTrang;
  }

  public Sach(String tenTacGia, int soTrang) {
    this.tenTacGia = tenTacGia;
    this.soTrang = soTrang;
  }

  public void hienThiThongTin() {
    super.hienThiThongTin();
    System.out.printf(" tentacgia: %s, soTrang: %s", tenTacGia, soTrang);
  }
}
