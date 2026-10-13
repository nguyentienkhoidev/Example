package com.khoinguyen.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
//    String text = """
//        RegExr was created by gskinner.com.
//
//        Edit the Expression & Text to see matches. Roll over matches      or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.
//
//        The side bar includes a Cheatsheet,454 2023 77777 full Reference, and Help. You can also Save & Share with the Community and view patterns you create or favorite in My Patterns.
//
//        Explore results with the Tools below. Replace & List output custom 3045 results. Details lists capture groups. Explain describes your expression in plain English.
//
//        ac, abc, abbc, abcdefg
//        """;
//    Pattern pattern = Pattern.compile("");
//    Matcher matcher = pattern.matcher(text);
//
//    // Duyệt và in ra tất cả các số tìm được
//    while (matcher.find()) {
//      System.out.println(matcher.group());
//    }

    String text = """
            Báo cáo tổng kết tiền thưởng dự án quý 3:
            Nhân viên Nguyễn Văn A nhận thưởng hoàn thành xuất sắc nhiệm vụ là 5000000 VNĐ.
            Nhân viên Trần Thị B đạt thưởng KPI là 3500000 đồng và thưởng sáng kiến 1200000 VNĐ.
            Đội nhóm phát triển nhận thưởng chung đợt 1 là 15000000 VNĐ.
            Ngoài ra, quỹ bổ sung thêm 800000 VNĐ cho các chi phí phát sinh.
        
            Lưu ý: Mã nhân viên NV01, NV02 không phải là số tiền thưởng.
        """;

    // Regex \b\d{4,}\b để tìm các chuỗi số nguyên độc lập có ít nhất 4 chữ số (tránh lấy số 1, 2, 3 trong đợt/quý)
    Pattern pattern = Pattern.compile("\\b\\d{4,}\\b");
    Matcher matcher = pattern.matcher(text);

    long totalBonus = 0;
    System.out.println("Danh sách các khoản tiền thưởng tìm được:");

    while (matcher.find()) {
      long amount = Long.parseLong(matcher.group());
      System.out.println("+ " + String.format("%,d", amount) + " VNĐ");
      totalBonus += amount;
    }

    System.out.println("-----------------------------------");
    System.out.println("Tổng số tiền thưởng: " + String.format("%,d", totalBonus) + " VNĐ");
    //regex => regext => độc file string text = "4234fsfsf dfds"  => cộng dồn lại
  }



}
