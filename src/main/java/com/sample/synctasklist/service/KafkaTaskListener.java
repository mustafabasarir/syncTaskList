package com.sample.synctasklist.service;

import com.sample.synctasklist.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;


@Service
@RequiredArgsConstructor

public class KafkaTaskListener {

    Logger logger = Logger.getLogger(this.getClass().getName());
    private  final ElasticSyncer elasticSyncer;


   // @KafkaListener(topics = {"${kafka.userTasks.topicName}"}, groupId = "${kafka.userTasks.groupName}", batch = "false")

    public void sync2Elastic(Task task){
        elasticSyncer.syncTask(task);

        logger.info(" 1 task is synced ");

    }

  //  @KafkaListener(topics = {"${kafka.userTasks.topicName}"}, groupId = "${kafka.userTasks.bulkGroupName}", batch = "true")
    public void bulkSync2Elastic(List<Task> taskList){
        elasticSyncer.syncTasks(taskList);

        logger.info("bulk " + taskList.size() + " tasks are  synced  ");

    }
}
