package com.task.task.Mapper;

import com.task.task.Entity.Task;
import com.task.task.Dto.TaskDto;

public class TaskMapper {
public static TaskDto mapTaskDto (Task task){
    return new TaskDto(
        task.getTaskId(),
        task.getTaskName(),
        task.getTaskDescription(),
        task.getDueDate());
} 

public static Task maptoTask (TaskDto taskDto){
    return new Task (
        taskDto.getTaskName(),
        taskDto.getTaskDescription(),
        taskDto.getDueDate()
    );
}
}
