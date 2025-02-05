package com.task.task.Dto;


public class TaskDto {
    private int taskID;
    private String taskName;
    private String taskDescription;
    private String dueDate;
    
    
    public TaskDto() {
    }

    
    public TaskDto(int taskID, String taskName, String taskDescription, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }


    public TaskDto(String taskName, String taskDescription, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }


    public int getTaskID() {
        return taskID;
    }


    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }


    public String getTaskName() {
        return taskName;
    }


    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    public String getTaskDescription() {
        return taskDescription;
    }


    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }


    public String getDueDate() {
        return dueDate;
    }


    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    
}
