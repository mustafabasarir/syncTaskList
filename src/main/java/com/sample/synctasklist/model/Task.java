package com.sample.synctasklist.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Document(indexName="usertask")
@Getter
@Setter
public class Task {


    private String userId;
    private String userName;
    private String camundaId;
    private String camundaUrl;
    private String processDefinitionKey;
    private String processDefinitionId;
    private String processInstanceId;
    private String taskDefinitionKey;
    private String taskName;
    private String executionId;
    private String taskId;
    private Object cif;
    private Object referenceId;
    private String fin;
    private String branch;
    private Object customerName;
    private String eventType;
    private Object formKey;
    private Object processBusinessKey;
    private String assignee;
    @Id
    private String abbProcessId;
    private Long taskCreatedDate;
    private List<Object> candidateGroups;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
