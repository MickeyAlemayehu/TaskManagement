package com.task.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TaskId;
    @Column(name = "TaskName")
    private String TaskName;
    @Column(name = "TaskDescription")
    private String TaskDescription;
    @Column(name = "DueDate")
    private LocalDate DueDate;
    
    
    public Task(String taskName, String taskDescription, LocalDate dueDate) {
        TaskName = taskName;
        TaskDescription = taskDescription;
        DueDate = dueDate;
    }
    public int getTaskId() {
        return TaskId;
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
