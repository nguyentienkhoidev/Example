package com.khoinguyen.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
//7/10/2026 => tìm ngày sau 8/10, 31/5 => 1/6 | 1- 31
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now(); //2026-10-07T21:27:56.736896
    System.out.println(now);

    // 1. Format: Đối tượng → Chuỗi hiển thị
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formatted = now.format(f1); // "06/10/2026 06:56:13"
    System.out.println(formatted);
  }
}
