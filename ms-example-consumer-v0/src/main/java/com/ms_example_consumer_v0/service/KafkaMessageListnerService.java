package com.ms_example_consumer_v0.service;

import lombok.extern.log4j.Log4j2;
import com.ms_example_consumer_v0.dto.Customer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaMessageListnerService {

//    @KafkaListener(topics = "ms-example-spring-topic-04",groupId = "ms-example-consumer-v0")
//    public void consume1(String message){
//        log.info("Consumer1 Messages : {}",message);
//    }
//
//    @KafkaListener(topics = "ms-example-spring-topic-04",groupId = "ms-example-consumer-v0")
//    public void consume2(String message){
//        log.info("Consumer2 Messages : {}",message);
//    }
//
//    @KafkaListener(topics = "ms-example-spring-topic-04",groupId = "ms-example-consumer-v0")
//    public void consume3(String message){
//        log.info("Consumer3 Messages : {}",message);
//    }

//    @KafkaListener(topics = "ms-example-spring-topic-04",groupId = "ms-example-consumer-v0")
//    public void consume4(String message){
//        log.info("Consumer4 Messages : {}",message);
//    }

    @KafkaListener(topics = "ms-example-spring-topic-05",groupId = "ms-customer-consumer-v0")
    public void consume5(Customer customer){
        log.info("Consumer5 Messages : {}",customer.toString());
    }
}
