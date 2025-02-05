package com.task.task.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.task.Dto.TaskDto;
import com.task.task.Mapper.TaskMapper;
import com.task.task.Repository.TaskRepository;
import com.task.task.Entity.Task;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskDto addTask (TaskDto taskDto){
        Task task = TaskMapper.maptoTask(taskDto);
        taskRepository.save(task);
        return TaskMapper.mapTaskDto(task); 
    }

    public TaskDto getTaskById (int taskId){
        Task task = taskRepository.findById(taskId).
        orElseThrow(/*exeption*/);
        return TaskMapper.mapTaskDto(task);
    }

    public TaskDto updateTaskById (int taskId, TaskDto updatedTask){
        Task task = taskRepository.findById(taskId).
        orElseThrow(/*exeption*/);
        if (updatedTask.getTaskName() != null){
            task.setTaskName(updatedTask.getTaskName());
        }
        if (updatedTask.getTaskDescription() != null){
            task.setTaskDescription(updatedTask.getTaskDescription());
        }
        if (updatedTask.getDueDate() != null){
            task.setDueDate(updatedTask.getDueDate());
        }
        taskRepository.save(task);
        return TaskMapper.mapTaskDto(task);
    }

    public void deleteTaskById (int TaskId){
        //exception if row with the specified id is not found
        taskRepository.deleteById(TaskId);
    }

    public List <TaskDto> getAllTask (){
        List <Task> tasks = taskRepository.findAll();
        return tasks.stream()
        .map(task -> TaskMapper.mapTaskDto(task)).
        collect(Collectors.toList()); 
    }


}
