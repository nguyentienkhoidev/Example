package com.khoinguyen.lesson15;

public class TryCatch5 {
  public static class Main {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3};

      try {
        // Cố tình truy cập phần tử ngoài mảng để gây lỗi
        System.out.println("Đang xử lý...");
        int x = arr[5]; // Lỗi ArrayIndexOutOfBoundsException xảy ra tại đây
        System.out.println("Dòng này sẽ KHÔNG bao giờ được in ra");

      } catch (ArrayIndexOutOfBoundsException e) {
        // Bắt đúng loại lỗi và xử lý
        System.out.println("Lỗi: Bạn đã truy cập quá giới hạn của mảng!");
        System.out.println("Chi tiết lỗi: " + e.getMessage());

      } catch (Exception e) {
        // Catch Exception chung chung luôn để ở cuối cùng (như một mẻ lưới dự phòng)
        System.out.println("Lỗi không xác định: " + e.toString());

      } finally {
        // Luôn luôn chạy
        System.out.println("Khối finally luôn được thực thi. Giải phóng tài nguyên...");
      }

      System.out.println("Chương trình vẫn chạy tiếp tục xuống đây...");
    }
  }
}
