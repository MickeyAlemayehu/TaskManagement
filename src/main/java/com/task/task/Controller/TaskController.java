package com.task.task.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.task.Dto.TaskDto;
import com.task.task.Service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping
    public ResponseEntity <TaskDto> addTask (@RequestBody TaskDto taskDto){
        TaskDto savedTask = taskService.addTask(taskDto);
        return new ResponseEntity<>(savedTask,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity <String> deleteTaskById (int TaskId){
        taskService.deleteTaskById(TaskId);
        return ResponseEntity.ok("Task Successfully Deleted");
    }
}
