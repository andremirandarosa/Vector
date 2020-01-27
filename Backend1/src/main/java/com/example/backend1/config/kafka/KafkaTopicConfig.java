package com.example.backend1.config.kafka;

import com.example.backend1.config.Config;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

/**  Configuracao do Topico do Kafka */
@Configuration
public class KafkaTopicConfig {
     
    @Value(value = "${kafka.address}")
    private String kafkaAddress;
    
    //==========================================================================
 
    @Bean
    public KafkaAdmin kafkaAdmin() {
        
        Map<String, Object> configs = new HashMap<>();
        
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaAddress);
        
        return new KafkaAdmin(configs);
    }
     
    @Bean
    public NewTopic topic1() {
         return new NewTopic(Config.kafkaTopic, 1, (short) 1);
    }
}