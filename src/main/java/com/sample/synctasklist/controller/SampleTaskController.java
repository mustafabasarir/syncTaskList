package com.sample.synctasklist.controller;

import com.sample.synctasklist.model.Task;
import com.sample.synctasklist.service.SampleTaskCreater;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleTaskController {

    private final SampleTaskCreater sampleTaskCreater;

    @GetMapping("api/createSampleTask")
    public void createSampleTask(Task task) {
        sampleTaskCreater.createMessage(task);

    }


    @GetMapping("api/createSampleTask/{count}")
    public void createSampleTasks(Task task, @PathVariable int count) {
        sampleTaskCreater.createMessages(task, count);

    }
}
