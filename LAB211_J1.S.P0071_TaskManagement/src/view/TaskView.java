package view;

import entity.Task;
import java.util.List;

public class TaskView {
    public void printMenu() {
        System.out.println("\n========= Task Program =========");
        System.out.println("1. Add Task");
        System.out.println("2. Delete task");
        System.out.println("3. Display Task");
        System.out.println("4. Exit");
    }

    public void displayTasks(List<Task> taskList) {
        if (taskList == null || taskList.isEmpty()) {
            System.out.println("Danh sách công việc đang trống!");
            return;
        }

        System.out.println("----------------------------------------- Task ---------------------------------------");
        System.out.printf("%-5s %-15s %-12s %-13s %-7s %-12s %-12s\n", 
                          "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        
        for (Task t : taskList) {
            System.out.printf("%-5d %-15s %-12s %-13s %-7.1f %-12s %-12s\n",
                    t.getId(),
                    t.getRequirementName(),
                    t.getTaskTypeName(),
                    t.getDate(),
                    t.getTotalTime(),
                    t.getAssignee(),
                    t.getReviewer()
            );
        }
    }
}
