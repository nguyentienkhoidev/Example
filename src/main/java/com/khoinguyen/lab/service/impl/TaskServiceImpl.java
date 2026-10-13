package com.khoinguyen.lab.service.impl;

import com.khoinguyen.lab.entity.Task;
import com.khoinguyen.lab.mapper.TaskMapper;
import com.khoinguyen.lab.model.TaskResponseDto;
import com.khoinguyen.lab.service.TaskService;
import com.khoinguyen.lab.util.Validation;
import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements TaskService {
  private static List<Task> taskList;
  private static int taskId;

  public TaskServiceImpl() {
    taskList = new ArrayList<>();
  }

  @Override
  public int addTask() {
    Task task = new Task();
    int idPresent = taskId;
    setInput(task);
    taskList.add(task);
    taskId++;
    return idPresent;
  }

  @Override
  public int deleteTask(int id) {
    taskList.stream().filter(task -> task.getId() == id)
        .findFirst().ifPresent(taskList::remove);
    return id;
  }

  @Override
  public List<TaskResponseDto> getTasks() {
    return taskList.stream()
        .map(TaskMapper::getTaskResponseDto)
        .toList();
  }

  public void setInput(Task task) {
    int taskTypeId = Validation.getInt("Input taskTypeId: ", 1, 4);
    String requirementName = Validation.getString("Input requirement name: ");
    String date = Validation.getDate("Input date: ");
    double plantFrom = Validation.getPlanTime("Input plan from: ");
    double plantTo = Validation.getPlanTime("Input plan to: ");
    String assignee = Validation.getString("Input assignee: ");
    String reviewer = Validation.getString("Input reviewer: ");

    task.setId(taskId);
    task.setTaskTypeId(taskTypeId);
    task.setRequirementName(requirementName);
    task.setDate(date);
    task.setPlanFrom(plantFrom);
    task.setPlanTo(plantTo);
    task.setAssignee(assignee);
    task.setReviewer(reviewer);
  }
}
