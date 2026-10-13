package com.khoinguyen.lab.controller;

import com.khoinguyen.lab.model.TaskResponseDto;
import com.khoinguyen.lab.service.TaskService;
import java.util.List;

public class TaskController implements ITask {
  private TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @Override
  public int addTask() {
    return taskService.addTask();
  }

  @Override
  public int deleteTask(int id) {
    return taskService.deleteTask(id);
  }

  @Override
  public List<TaskResponseDto> getTasks() {
    return taskService.getTasks();
  }
}
