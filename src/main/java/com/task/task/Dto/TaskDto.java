package com.task.task.Dto;


public class TaskDto {
    private int TaskID;
    private String TaskName;
    private String TaskDescription;
    private String DueDate;
    
    
    public TaskDto(int taskID, String taskName, String taskDescription, String dueDate) {
        TaskID = taskID;
        TaskName = taskName;
        TaskDescription = taskDescription;
        DueDate = dueDate;
    }
    public TaskDto(String taskName, String taskDescription, String dueDate) {
        TaskName = taskName;
        TaskDescription = taskDescription;
        DueDate = dueDate;
    }
    public int getTaskID() {
        return TaskID;
    }
    public void setTaskID(int taskID) {
        TaskID = taskID;
    }
    public String getTaskName() {
        return TaskName;
    }
    public void setTaskName(String taskName) {
        TaskName = taskName;
    }
    public String getTaskDescription() {
        return TaskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        TaskDescription = taskDescription;
    }
    public String getDueDate() {
        return DueDate;
    }
    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    
}
