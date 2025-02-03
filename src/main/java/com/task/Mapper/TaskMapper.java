package com.task.Mapper;

import com.task.Entity.Task;
import com.task.Dto.TaskDto;

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
