package com.khoinguyen.lab.view;

import com.khoinguyen.lab.controller.TaskController;
import com.khoinguyen.lab.model.TaskResponseDto;
import com.khoinguyen.lab.service.TaskService;
import com.khoinguyen.lab.service.impl.TaskServiceImpl;
import com.khoinguyen.lab.util.Validation;
import java.util.List;

public class View {
  TaskController taskController;

  public View() {
    TaskService taskService = new TaskServiceImpl();
    taskController = new TaskController(taskService);
  }

  public void menu() {
    System.out.println("========= Task Program =========");
    System.out.println("1. Add Task");
    System.out.println("2. Delete task");
    System.out.println("3. Display Task");
    System.out.println("4. Exit");
  }

  public void addTask() {
    System.out.println("========= Add Task =========");
    taskController.addTask();
  }

  public void deleteTask() {
    System.out.println("========= Delete Task =========");
    int id = Validation.getInt("Id: ", 1, Integer.MAX_VALUE);
    taskController.deleteTask(id);
    System.out.println("Task deleted successfully");
  }

  public void displayTask() {
    List<TaskResponseDto> taskResponseDtos = taskController.getTasks();
    System.out.println("========= Display Task =========");
    System.out.println("----------------------------------------- Task ---------------------------------------");
    System.out.printf("%-5s %-15s %-12s %-13s %-7s %-12s %-12s\n",
        "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
    // Lặp qua danh sách và in từng Task
    for (TaskResponseDto t : taskResponseDtos) {
      System.out.printf("%-5d %-15s %-12s %-13s %-7.1f %-12s %-12s\n",
          t.getTaskId(),
          t.getTaskName(),
          t.getTaskType(),
          t.getDate(),
          t.getTime(),
          t.getAssignee(),
          t.getReviewer()
      );
    }
  }

  public void allTasks() {
    while (true) {
      menu();
      int option = Validation.getInt("Please choice one option: ", 1, 4);
      switch (option) {
        case 1:
          addTask();
          break;
        case 2:
          deleteTask();
          break;
        case 3:
          displayTask();
          break;
        case 4:
          System.out.println("Exit");
          System.exit(0);
      }
    }

  }

}
