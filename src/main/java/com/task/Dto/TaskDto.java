package com.task.Dto;

import java.time.LocalDate;

public class TaskDto {
    private int TaskID;
    private String TaskName;
    private String TaskDescription;
    private LocalDate DueDate;
    
    
    public TaskDto(int taskID, String taskName, String taskDescription, LocalDate dueDate) {
        TaskID = taskID;
        TaskName = taskName;
        TaskDescription = taskDescription;
        DueDate = dueDate;
    }
    public TaskDto(String taskName, String taskDescription, LocalDate dueDate) {
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
    public LocalDate getDueDate() {
        return DueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        DueDate = dueDate;
    }

    
}
