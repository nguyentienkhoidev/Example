package com.khoinguyen.bt10.bai8;

public class MyDate {

  int day;
  int month;
  int year;

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate() {
  }

  public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }

  public int getDate(int month) {
    return switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      case 2 -> {

        if (isLeapYear(year)) {
          yield 29;
        }
        yield 28;
      }
      default -> 0;
    };
  }

  public MyDate nextDay() {
    int date = getDate(this.month);
    if (this.month == 12 && date == 31) {//cuối năm
      return new MyDate(1, 1, this.year + 1);
    } else if (date == this.day) {//ngày cuối tháng
      return new MyDate(1, this.month + 1, this.year);
    }
    return new MyDate(this.day + 1, this.month, this.year);//ngày thường
  }

  public void display() {
    MyDate nextDay = nextDay();
    System.out.printf("%s/%s/%s -> nextDay() -> %s/%s/%s", concat0ToStart(this.day),
        concat0ToStart(this.month), this.year, concat0ToStart(nextDay.day),
        concat0ToStart(nextDay.month), nextDay.year);
  }

  public String concat0ToStart(int number) {
    return number < 10 ? "0" + number : "" + number;
  }
}

