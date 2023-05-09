package com.sample.synctasklist.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class KafkaConfig {


    @Value( value ="${kafka.userTasks.topicName}")
    private String sampleTopicName;



    @Bean
    public NewTopic msgTopic(){
        System.out.println( new Date().getTime() + " " + sampleTopicName + " Topic Created");
        return new NewTopic(sampleTopicName,1,(short)1);

    }



}
