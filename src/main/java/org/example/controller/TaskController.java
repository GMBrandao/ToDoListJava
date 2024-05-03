package org.example.controller;

import org.example.constant.Constant;
import org.example.dto.TaskDTO;
import org.example.model.Task;
import org.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    //http://localhost:8080/swagger-ui.html

    @Autowired
    private TaskService taskService;

    @PostMapping(Constant.API_TASK)
    public void save(@RequestBody TaskDTO taskDTO){
        taskService.save(taskDTO);
    }

    @PutMapping(Constant.API_TASK)
    public void update(@RequestBody Task task) { taskService.save(task);}

    @DeleteMapping(Constant.API_TASK + "/{id}")
    public void delete(@PathVariable("id") String id) { taskService.Delete(id);}

    @GetMapping(Constant.API_TASK)
    public List<Task> findAll(){
        return taskService.findAll();
    }

    @GetMapping(Constant.API_TASK + "/{id}")
    public Optional<Task> findByID(@PathVariable("id") String id) { return taskService.findById(id); }

}
