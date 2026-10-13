package com.khoinguyen.lab.model;

public class TaskRequestDto {
  private String requirementName;
  private String assignee;
  private String reviewer;
  private String taskTypeID;
  private String date;
  private String planFrom;
  private String planTo;

  public TaskRequestDto() {
  }

  public TaskRequestDto(String requirementName, String assignee, String reviewer, String taskTypeID,
      String date, String planFrom, String planTo) {
    this.requirementName = requirementName;
    this.assignee = assignee;
    this.reviewer = reviewer;
    this.taskTypeID = taskTypeID;
    this.date = date;
    this.planFrom = planFrom;
    this.planTo = planTo;
  }

  public String getRequirementName() {
    return requirementName;
  }

  public void setRequirementName(String requirementName) {
    this.requirementName = requirementName;
  }

  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public String getReviewer() {
    return reviewer;
  }

  public void setReviewer(String reviewer) {
    this.reviewer = reviewer;
  }

  public String getTaskTypeID() {
    return taskTypeID;
  }

  public void setTaskTypeID(String taskTypeID) {
    this.taskTypeID = taskTypeID;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getPlanFrom() {
    return planFrom;
  }

  public void setPlanFrom(String planFrom) {
    this.planFrom = planFrom;
  }

  public String getPlanTo() {
    return planTo;
  }

  public void setPlanTo(String planTo) {
    this.planTo = planTo;
  }
}
