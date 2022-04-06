package org.acme.service;

import org.acme.model.Task;
import org.acme.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask (Task task){
        return taskRepository.save(task);
    }
}
