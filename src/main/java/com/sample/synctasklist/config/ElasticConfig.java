package com.sample.synctasklist.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.sample.synctasklist.model")
public class ElasticConfig  extends ElasticsearchConfiguration {

    @Value( value ="${spring.elasticsearch.rest.uris}")
    private String elasticHost;

    @Override
    public ClientConfiguration clientConfiguration() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(elasticHost)
                .build();

        return clientConfiguration;
    }
}
