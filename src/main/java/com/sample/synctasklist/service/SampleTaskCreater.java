package com.sample.synctasklist.service;

import com.sample.synctasklist.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
@RequiredArgsConstructor
public class SampleTaskCreater {

    private final KafkaTemplate<String, Task> kafkaTemplate;
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Value(value = "${kafka.userTasks.topicName}")
    private String sampleTopicName;

    public void createMessages(Task task, int msgCount) {

        for (int i = 0; i < msgCount; i++) {
            kafkaTemplate.send(sampleTopicName, task);
            logger.info(i + ":   task published " + task.getTaskId());
        }
    }

    public void createMessage(Task task) {

        kafkaTemplate.send(sampleTopicName, task);
        logger.info("task published " + task.getTaskId());

    }


}
