package com.khoinguyen.lab.controller;


import com.khoinguyen.lab.model.TaskRequestDto;
import com.khoinguyen.lab.model.TaskResponseDto;
import java.util.List;

public interface ITask {
  int addTask();
  int deleteTask(int id);
  List<TaskResponseDto> getTasks();
}
