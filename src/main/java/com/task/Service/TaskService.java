package com.task.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Dto.TaskDto;
import com.task.Mapper.TaskMapper;
import com.task.Repository.TaskRepository;
import com.task.Entity.Task;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskDto addTask (TaskDto taskDto){
        Task task = TaskMapper.maptoTask(taskDto);
        taskRepository.save(task);
        return TaskMapper.mapTaskDto(task); 
    }

    public void deleteTaskById (int TaskId){
        //exception if row with the specified id is not found
        taskRepository.deleteById(TaskId);
    }
}
