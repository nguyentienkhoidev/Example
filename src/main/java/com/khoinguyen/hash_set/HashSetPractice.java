package com.khoinguyen.hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetPractice {
  // Lưu trữ email duy nhất của người dùng
  private Set<String> emails = new HashSet<>();

  /**
   * 1. Thêm email. Trả về true nếu thêm thành công, false nếu email đã tồn tại.
   * Hàm cần dùng: add()
   */
  public boolean addEmail(String email) {
    // TODO
    return emails.add(email);
  }

  /**
   * 2. Xóa email. Trả về true nếu xóa thành công.
   * Hàm cần dùng: remove()
   */
  public boolean removeEmail(String email) {
    // TODO
    return emails.remove(email);
  }

  /**
   * 3. Kiểm tra xem email có tồn tại hay không.
   * Hàm cần dùng: contains()
   */
  public boolean hasEmail(String email) {
    // TODO
    return emails.contains(email);
  }

  /**
   * 4. Lấy số lượng email hiện có.
   * Hàm cần dùng: size()
   */
  public int getCount() {
    // TODO
    return emails.size();
  }

  /**
   * 5. Kiểm tra danh sách có trống không.
   * Hàm cần dùng: isEmpty()
   */
  public boolean isListEmpty() {
    // TODO
    return emails.isEmpty();
  }

  /**
   * 6. Xóa toàn bộ dữ liệu.
   * Hàm cần dùng: clear()
   */
  public void clearAll() {
    emails.clear();
  }

  /**
   * 7. In ra toàn bộ email bằng Iterator.
   * Hàm cần dùng: iterator(), hasNext(), next()
   */
  public void printEmails() {
    // TODO: Dùng Iterator để duyệt và in ra màn hình
    for (String email : emails) {
      System.out.println(email);
    }
  }

  /**
   * 8. HỢP NHẤT: Thêm một danh sách email khác vào danh sách hiện tại.
   * Hàm cần dùng: addAll()
   */
  public void mergeEmails(Set<String> otherEmails) {
    // TODO
    emails.addAll(otherEmails);
  }

  /**
   * 9. LỌC TRÙNG (Giao nhau): Chỉ giữ lại những email xuất hiện ở CẢ 2 danh sách.
   * Hàm cần dùng: retainAll()
   */
  public void keepCommonEmails(Set<String> otherEmails) {
    // TODO
    emails.retainAll(otherEmails);
  }

  /**
   * 10. LOẠI TRỪ (Hiệu): Xóa khỏi hệ thống những email nằm trong blacklist.
   * Hàm cần dùng: removeAll()
   */
  public void removeBlacklist(Set<String> blacklist) {
    // TODO
    emails.removeAll(blacklist);
  }
}