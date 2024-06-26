package org.example.repository;

import org.example.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository  extends MongoRepository<Task, String>
{
}
