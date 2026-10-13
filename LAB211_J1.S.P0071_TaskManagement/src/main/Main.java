package main;

import controller.TaskManager;
import util.Validation;
import view.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskView view = new TaskView();

        while (true) {
            view.printMenu();
            int choice = Validation.getInt("Please choose one option: ", 1, 4);

            switch (choice) {
                case 1:
                    System.out.println("\n------------ Add Task ------------");
                    String name = Validation.getString("Requirement Name: ");
                    int typeId = Validation.getInt("Task Type (1-Code, 2-Test, 3-Design, 4-Review): ", 1, 4);
                    String date = Validation.getDate("Date (dd-MM-yyyy): ");
                    
                    double planFrom = 0;
                    double planTo = 0;
                    while (true) {
                        planFrom = Validation.getPlanTime("From (8.0 - 17.5): ");
                        planTo = Validation.getPlanTime("To (8.0 - 17.5): ");
                        if (planFrom < planTo) {
                            break;
                        }
                        System.out.println("Thời gian bắt đầu (From) phải nhỏ hơn thời gian kết thúc (To)! Vui lòng nhập lại.");
                    }

                    String assignee = Validation.getString("Assignee: ");
                    String reviewer = Validation.getString("Reviewer: ");

                    try {
                        int newId = taskManager.addTask(name, assignee, reviewer, 
                                                        String.valueOf(typeId), date, 
                                                        String.valueOf(planFrom), String.valueOf(planTo));
                        System.out.println("Add Task success with ID: " + newId);
                    } catch (Exception e) {
                        System.out.println("Add Task failed: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n------------ Delete Task ------------");
                    String idStr = Validation.getString("ID: ");
                    try {
                        taskManager.deleteTask(idStr);
                        System.out.println("Delete success!");
                    } catch (Exception e) {
                        System.out.println("Delete failed: " + e.getMessage());
                    }
                    break;

                case 3:
                    view.displayTasks(taskManager.getDataTasks());
                    break;

                case 4:
                    System.out.println("Chương trình kết thúc. Tạm biệt!");
                    System.exit(0);
                    break;
            }
        }
    }
}
