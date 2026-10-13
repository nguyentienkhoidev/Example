# LAB211 - J1.S.P0071: Task Management Program

## 📂 Cấu trúc thư mục dự án
```
LAB211_J1.S.P0071_TaskManagement/
└── src/
    ├── entity/
    │   ├── TaskType.java       # Đối tượng loại công việc (Code, Test, Design, Review)
    │   └── Task.java           # Thực thể Task với đầy đủ thuộc tính, getter/setter
    ├── controller/
    │   └── TaskManager.java    # Xử lý nghiệp vụ chính: addTask, deleteTask, getDataTasks
    ├── view/
    │   └── TaskView.java       # Hiển thị Menu và bảng dữ liệu Task
    ├── util/
    │   └── Validation.java     # Kiểm tra dữ liệu (Date dd-MM-yyyy, Time 8.0-17.5, số nguyên)
    └── main/
        └── Main.java           # Điều phối luồng chương trình
```

## 🚀 Hướng dẫn biên dịch và chạy bằng dòng lệnh
```bash
# 1. Di chuyển vào thư mục dự án
cd LAB211_J1.S.P0071_TaskManagement

# 2. Tạo thư mục bin chứa file .class
mkdir -p bin

# 3. Biên dịch tất cả các file mã nguồn Java
javac -d bin -sourcepath src src/main/Main.java

# 4. Chạy chương trình
java -cp bin main.Main
```
