package org.example.service;

import org.example.dto.TaskDTO;
import org.example.model.Task;
import org.example.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private ITaskRepository taskRepository;

    public void save(TaskDTO taskDTO) {
        Task task = new Task(taskDTO);

        taskRepository.save(task);
    }
    public void save(Task task) {
        taskRepository.save(task);
    }


    public Optional<Task> findById(String id) {
        return taskRepository.findById(id);
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public void Delete(String id){
        taskRepository.deleteById(id);
    }
}
