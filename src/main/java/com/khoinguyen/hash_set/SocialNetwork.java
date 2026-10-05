package com.khoinguyen.hash_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SocialNetwork {

  /**
   * SocialNetwork Đề bài: Xây dựng Hệ thống Bạn bè trong Mạng Xã Hội (Social Network) Bạn cần xây
   * dựng một class SocialNetwork để quản lý danh sách bạn bè của người dùng. Hệ thống cần có khả
   * năng kết bạn, hủy kết bạn, tìm bạn chung (Mutual Friends) và gợi ý kết bạn (Suggest Friends).
   * <p>
   * Cấu trúc dữ liệu yêu cầu: Dùng HashMap<String, HashSet<String>> để biểu diễn đồ thị bạn bè
   * (Graph - Adjacency List).
   * <p>
   * Key (String): Tên (hoặc ID) của người dùng. Value (HashSet<String>): Tập hợp những người bạn
   * của người dùng đó.
   */

// Đồ thị biểu diễn mối quan hệ bạn bè
  private final Map<String, Set<String>> friendGraph;
  //khoi - []

  public SocialNetwork() {
    friendGraph = new HashMap<>();
  }

  // ============ HÀM TEST ============
  public static void main(String[] args) {
    SocialNetwork fb = new SocialNetwork();
    fb.addUser("A");
    fb.addUser("B");
    fb.addUser("C");
    fb.addUser("D");
    System.out.println(fb.friendGraph);
    fb.makeFriends("A", "B");
    fb.makeFriends("A", "C");
    fb.makeFriends("A", "D");
    fb.makeFriends("B", "C");
    fb.makeFriends("B", "D");

    Set<String> common = fb.getMutualFriends("A", "B");
    System.out.println("Ds Ban Chung: "+common);

    //suggest

    System.out.println("Ds suggest: "+fb.suggestFriends("A"));
    System.out.println(fb.friendGraph);

//    fb.makeFriends("Khoi", "An");
//    fb.makeFriends("Khoi", "Binh");
//    fb.makeFriends("An", "Cuong");
//    fb.makeFriends("Binh", "Cuong");
//    fb.makeFriends("Binh", "Dung");
//    // Đồ thị lúc này:
//    // Khoi  -> [An, Binh]
//    // An    -> [Khoi, Cuong]
//    // Binh  -> [Khoi, Cuong, Dung]
//    // Cuong -> [An, Binh]
//    // Dung  -> [Binh]
//    // 1. Tìm bạn chung của Khoi và Cuong -> Kết quả mong đợi: [An, Binh]
//    System.out.println("Bạn chung của Khoi và Cuong: " + fb.getMutualFriends("Khoi", "Cuong"));
//    // 2. Gợi ý kết bạn cho Khoi -> Kết quả mong đợi: [Cuong, Dung]
//    // (Vì Cuong là bạn của An/Binh, Dung là bạn của Binh, và Khoi chưa kết bạn với họ)
//    System.out.println("Gợi ý kết bạn cho Khoi: " + fb.suggestFriends("Khoi"));
  }

  /**
   * 1. Thêm một user vào hệ thống (nếu chưa tồn tại). Yêu cầu: Dùng hàm putIfAbsent() khởi tạo một
   * HashSet rỗng cho user.
   */
  public void addUser(String user) {
    // TODO: Code tại đây
    friendGraph.putIfAbsent(user, new HashSet<>());
  }

  /**
   * 2. Kết bạn giữa 2 người (Mối quan hệ 2 chiều). Yêu cầu: Thêm userB vào danh sách của userA và
   * ngược lại. Lưu ý: Phải chắc chắn cả 2 user đều đã có trong friendGraph (gọi hàm addUser).
   */
  public void makeFriends(String userA, String userB) {
    // TODO: Code tại đây
    //private final Map<String, Set<String>> friendGraph;
    // khoi - [ha, lan]
    if(!friendGraph.containsKey(userA) || !friendGraph.containsKey(userB)) {
      System.out.println("User " + userA + " does not exist");
      return;
    }

    friendGraph.get(userA).add(userB);
    friendGraph.get(userB).add(userA);
  }

  /**
   * 3. Hủy kết bạn (Mối quan hệ 2 chiều). Yêu cầu: Xóa userB khỏi danh sách của userA và ngược
   * lại.
   */
  public void unfriend(String userA, String userB) {
    // TODO: Code tại đây
    friendGraph.get(userA).remove(userB);
    friendGraph.get(userB).remove(userA);
  }

  /**
   * 4. Lấy danh sách "BẠN CHUNG" của 2 người. Yêu cầu: Trả về một Set chứa những người vừa là bạn
   * của userA, vừa là bạn của userB. (Gợi ý: Clone HashSet của userA, sau đó dùng hàm retainAll()
   * với HashSet của userB)
   */
  public Set<String> getMutualFriends(String userA, String userB) {
    // TODO: Code tại đây
    Set<String> friendA = friendGraph.get(userA);
    Set<String> friendB = friendGraph.get(userB);

    friendA.retainAll(friendB);

    return friendA;
  }

  /**
   * 5. Gợi ý kết bạn cho 1 user (Bạn của bạn). Yêu cầu: Tìm tất cả BẠN CỦA BẠN của user này, nhưng:
   * - Không được bao gồm chính bản thân user đó. - Không được bao gồm những người đã là bạn trực
   * tiếp rồi.
   * <p>
   * (Gợi ý: Duyệt qua danh sách bạn bè hiện tại, lấy danh sách bạn của họ gộp vào 1 HashSet mới,
   * sau đó dùng remove() để loại bỏ bản thân và removeAll() để loại danh sách bạn hiện tại).
   */
  public Set<String> suggestFriends(String user) {
    // TODO: Code tại đây
    Set<String> friendA = friendGraph.get(user);
    Set<String> friendOfA = new HashSet<>();

    for(String friend : friendA) {
      Set<String> friends = friendGraph.get(friend);
      friendOfA.addAll(friends);
    }

    friendOfA.remove(user);

    return friendOfA;
  }

  /**
   {A=[C, D], B=[A, C, D], C=[A, B], D=[A, B]}
   [B]
   [C, D]
   */
}
