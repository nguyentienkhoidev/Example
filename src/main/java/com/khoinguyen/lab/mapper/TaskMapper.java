package com.khoinguyen.lab.mapper;

import com.khoinguyen.lab.entity.Task;
import com.khoinguyen.lab.entity.TaskType;
import com.khoinguyen.lab.model.TaskResponseDto;

public class TaskMapper {

  public static TaskResponseDto getTaskResponseDto(Task task) {
    TaskResponseDto taskResponseDto = new TaskResponseDto();
    taskResponseDto.setTaskId(task.getId());
    taskResponseDto.setTaskName(taskResponseDto.getTaskName());
    taskResponseDto.setTaskType(TaskType.getTaskTypeName(task.getTaskTypeId()));
    taskResponseDto.setDate(task.getDate());
    taskResponseDto.setTime(task.getPlanFrom() - task.getPlanTo());
    taskResponseDto.setAssignee(task.getAssignee());
    taskResponseDto.setReviewer(task.getReviewer());
    return taskResponseDto;
  }
}
