package com.task.task.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.task.Dto.TaskDto;
import com.task.task.Service.TaskService;

@RestController
@RequestMapping("/api/username/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping
    public ResponseEntity <TaskDto> addTask (@RequestBody TaskDto taskDto){
        TaskDto savedTask = taskService.addTask(taskDto);
        return new ResponseEntity<>(savedTask,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity <List<TaskDto>> getAllTask(){
        List <TaskDto> tasks = taskService.getAllTask();
        return ResponseEntity.ok(tasks); 
    }
    @GetMapping("{id}")
    public ResponseEntity <TaskDto> getTaskById(@PathVariable("id") int taskId){
        TaskDto taskDto = taskService.getTaskById(taskId);
        return ResponseEntity.ok(taskDto);
    }
    @PutMapping("{id}")
    public ResponseEntity <TaskDto> updateTaskById(@PathVariable("id") int taskId, @RequestBody TaskDto upatedTaskDto){
        TaskDto taskDto = taskService.updateTaskById(taskId, upatedTaskDto);
        return ResponseEntity.ok(taskDto);
    }
    @DeleteMapping("{id}")
    public ResponseEntity <String> deleteTaskById (@PathVariable("id") int TaskId){
        taskService.deleteTaskById(TaskId);
        return ResponseEntity.ok("Task Successfully Deleted");
    }
}
