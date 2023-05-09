package com.sample.synctasklist.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;



public interface TaskRepository  extends ElasticsearchRepository<Task, String> {

    Page<Task> findByUserName(String userName, Pageable pageable);
}
