package org.example.model;

import org.example.dto.TaskDTO;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task {
    public Task(){}

    public Task(TaskDTO taskDTO){
        this.name = taskDTO.getName();
    }

    private String _id;
    private String name;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
