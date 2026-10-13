package com.khoinguyen.lab.entity;

public class TaskType {
  private String id;
  private String name;
  private String description;

  public TaskType() {
  }

  public TaskType(String id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public static String getTaskTypeName(int id) {
    return switch (id) {
      case 1 -> "Code";
      case 2 -> "Test";
      case 3 -> "Design";
      case 4 -> "Review";
      default -> "Unknown";
    };
  }
}
