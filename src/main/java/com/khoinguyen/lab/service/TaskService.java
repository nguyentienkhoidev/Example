package com.khoinguyen.lab.service;

import com.khoinguyen.lab.model.TaskRequestDto;
import com.khoinguyen.lab.model.TaskResponseDto;
import java.util.List;

public interface TaskService {

  int addTask();

  int deleteTask(int id);

  List<TaskResponseDto> getTasks();
}
