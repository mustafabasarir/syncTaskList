package com.sample.synctasklist.service;

import com.sample.synctasklist.model.Task;
import com.sample.synctasklist.model.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ElasticSyncer {
    private final TaskRepository taskRepository;

    public void syncTask(Task task){
        taskRepository.save(task);
    }
    public void   syncTasks(List<Task> tasks) {
       taskRepository.saveAll(tasks);
    }
}
