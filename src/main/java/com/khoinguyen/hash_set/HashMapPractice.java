package com.khoinguyen.hash_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class HashMapPractice {
  // Key: Từ tiếng Anh, Value: Nghĩa tiếng Việt
  private Map<String, String> dictionary = new HashMap<>();

  /**
   * 1. Thêm từ mới hoặc cập nhật từ đã có.
   * Hàm cần dùng: put()
   */
  public void addOrUpdateWord(String english, String vietnamese) {
    // TODO
    dictionary.put(english, vietnamese);
  }

  /**
   * 2. Chỉ thêm từ nếu TỪ ĐÓ CHƯA TỒN TẠI (tránh ghi đè).
   * Hàm cần dùng: putIfAbsent()
   */
  public void addWordIfNotExist(String english, String vietnamese) {
    // TODO
    dictionary.putIfAbsent(english, vietnamese);
  }

  /**
   * 3. Lấy nghĩa của từ. Nếu từ không có, trả về chuỗi "Not found".
   * Hàm cần dùng: getOrDefault()
   */
  public String translate(String english) {
    // TODO
    return dictionary.getOrDefault(english, "aduma");
  }

  /**
   * 4. Kiểm tra xem từ điển có chứa từ tiếng Anh này không.
   * Hàm cần dùng: containsKey()
   */
  public boolean hasWord(String english) {
    // TODO
    return dictionary.containsKey(english);
  }

  /**
   * 5. Kiểm tra xem có từ nào mang nghĩa tiếng Việt này không.
   * Hàm cần dùng: containsValue()
   */
  public boolean hasMeaning(String vietnamese) {
    // TODO
    return dictionary.containsValue(vietnamese);
  }

  /**
   * 6. Thay thế nghĩa của một từ CHỈ KHI từ đó đã tồn tại trong Map.
   * Hàm cần dùng: replace()
   */
  public void updateMeaningIfExists(String english, String newVietnamese) {
    // TODO
    //cat - meo
    //dog - cho


    dictionary.replace(english, newVietnamese); //"cat" => "meo meo""
  }

  /**
   * 7. Xóa một từ khỏi từ điển.
   * Hàm cần dùng: remove()
   */
  public void deleteWord(String english) {
    // TODO
    dictionary.remove(english);
  }

  /**
   * 8. Trả về Tập hợp tất cả các từ tiếng Anh (Keys).
   * Hàm cần dùng: keySet()
   */
  public Set<String> getAllEnglishWords() {
    // TODO
    return dictionary.keySet();//get key
  }

  /**
   * 9. Trả về Danh sách tất cả các nghĩa tiếng Việt (Values).
   * Hàm cần dùng: values()
   */
  public Collection<String> getAllMeanings() {
    // TODO
    return dictionary.values();
  }

  /**
   * 10. In ra toàn bộ Từ điển theo format: "[English] -> [Vietnamese]"
   * Hàm cần dùng: entrySet() hoặc forEach(BiConsumer)
   */
  public void printDictionary() {
    // TODO: Gợi ý dùng vòng lặp for-each duyệt qua dictionary.entrySet()
    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  public static void main(String[] args) {
    HashMapPractice map = new HashMapPractice();
    map.dictionary.put("cat", "meo");
    map.dictionary.put("dog", "cho");
    map.dictionary.put("sleep", "ngu");

    map.printDictionary();
  }
}
