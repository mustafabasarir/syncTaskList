package com.sample.synctasklist.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Document(indexName="usertask")
@Getter
@Setter

public class Task {

    @Id
    private  String id;

    @Field(type= FieldType.Text)
    private String userId;
    @Field(type= FieldType.Text)
    private String userName;
    @Field(type= FieldType.Text)
    private String camundaId;
    @Field(type= FieldType.Text)
    private String camundaUrl;
    @Field(type= FieldType.Text)
    private String processDefinitionKey;
    @Field(type= FieldType.Text)
    private String processDefinitionId;
    @Field(type= FieldType.Text)
    private String processInstanceId;
    @Field(type= FieldType.Text)
    private String taskDefinitionKey;
    @Field(type= FieldType.Text)
    private String taskName;
    @Field(type= FieldType.Text)
    private String executionId;
    @Field(type= FieldType.Text)
    private String taskId;
    @Field(type= FieldType.Text)
    private String cif;
    @Field(type= FieldType.Text)
    private String referenceId;
    @Field(type= FieldType.Text)
    private String fin;
    @Field(type= FieldType.Text)
    private String branch;
    @Field(type= FieldType.Text)
    private Object customerName;
    @Field(type= FieldType.Text)
    private String eventType;
    @Field(type= FieldType.Text)
    private String formKey;
    @Field(type= FieldType.Text)
    private String processBusinessKey;
    @Field(type= FieldType.Text)
    private String assignee;
    @Field(type= FieldType.Text)
    private String abbProcessId;
    @Field(type= FieldType.Date)
    private Long taskCreatedDate;
    @Field(type= FieldType.Nested)
    private List<String> candidateGroups;
    @Field(type= FieldType.Nested)
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
