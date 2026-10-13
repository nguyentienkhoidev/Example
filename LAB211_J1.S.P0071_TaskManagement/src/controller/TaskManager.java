package controller;

import entity.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;
    private int lastId;

    public TaskManager() {
        this.taskList = new ArrayList<>();
        this.lastId = 0;
    }

    /**
     * Bắt buộc theo đặc tả của đề bài LAB211 J1.S.P0071:
     * public int addTask(String requirementName, String assignee, String reviewer, 
     *                    String taskTypeID, String date, String planFrom, String planTo) throws Exception
     */
    public int addTask(String requirementName, String assignee, String reviewer, 
                       String taskTypeID, String date, String planFrom, String planTo) throws Exception {
        // Validate TaskTypeID
        int typeId;
        try {
            typeId = Integer.parseInt(taskTypeID.trim());
            if (typeId < 1 || typeId > 4) {
                throw new Exception("Loại công việc (TaskTypeID) phải từ 1 đến 4!");
            }
        } catch (NumberFormatException e) {
            throw new Exception("TaskTypeID phải là một số nguyên!");
        }

        // Validate Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date.trim());
        } catch (Exception e) {
            throw new Exception("Ngày không đúng định dạng dd-MM-yyyy hoặc không tồn tại!");
        }

        // Validate Plan From & Plan To
        double from, to;
        try {
            from = Double.parseDouble(planFrom.trim());
            to = Double.parseDouble(planTo.trim());
        } catch (NumberFormatException e) {
            throw new Exception("Plan From và Plan To phải là số thực (ví dụ: 8.0, 8.5)!");
        }

        if (from < 8.0 || from > 17.5 || to < 8.0 || to > 17.5) {
            throw new Exception("Thời gian phải nằm trong khoảng từ 8.0 đến 17.5!");
        }

        if (from % 0.5 != 0 || to % 0.5 != 0) {
            throw new Exception("Thời gian phải có bước nhảy là 0.5 (ví dụ: 8.0, 8.5, 9.0)!");
        }

        if (from >= to) {
            throw new Exception("Plan From phải nhỏ hơn Plan To!");
        }

        if (requirementName == null || requirementName.trim().isEmpty()) {
            throw new Exception("Tên Requirement không được để trống!");
        }

        if (assignee == null || assignee.trim().isEmpty()) {
            throw new Exception("Người thực hiện (Assignee) không được để trống!");
        }

        if (reviewer == null || reviewer.trim().isEmpty()) {
            throw new Exception("Người duyệt (Reviewer) không được để trống!");
        }

        // Tạo task mới với ID tự tăng
        int newId = ++this.lastId;
        Task newTask = new Task(newId, typeId, requirementName.trim(), date.trim(), from, to, assignee.trim(), reviewer.trim());
        this.taskList.add(newTask);
        return newId;
    }

    /**
     * Bắt buộc theo đặc tả của đề bài LAB211 J1.S.P0071:
     * public void deleteTask(String id) throws Exception
     */
    public void deleteTask(String id) throws Exception {
        int taskId;
        try {
            taskId = Integer.parseInt(id.trim());
        } catch (NumberFormatException e) {
            throw new Exception("Task ID phải là một số nguyên!");
        }

        Task foundTask = null;
        for (Task t : taskList) {
            if (t.getId() == taskId) {
                foundTask = t;
                break;
            }
        }

        if (foundTask == null) {
            throw new Exception("Không tìm thấy Task có ID = " + taskId + " trong hệ thống!");
        }

        taskList.remove(foundTask);
    }

    /**
     * Bắt buộc theo đặc tả của đề bài LAB211 J1.S.P0071:
     * public List<Task> getDataTasks()
     */
    public List<Task> getDataTasks() {
        return this.taskList;
    }
}
