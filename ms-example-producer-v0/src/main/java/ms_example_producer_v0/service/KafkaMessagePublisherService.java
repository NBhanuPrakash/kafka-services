package ms_example_producer_v0.service;

import lombok.extern.log4j.Log4j2;
import ms_example_producer_v0.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Log4j2
@Service
public class KafkaMessagePublisherService {

    @Autowired
    private KafkaTemplate<String,Customer> template;


//    public void sendMessageToTopic(String message) {
//        CompletableFuture<SendResult<String, String>> future = template.send("ms-example-spring-topic-04", message);
//        future.whenComplete((result, er) -> {
//            if (er == null) {
//                System.out.println("Sent Message=[" + message + "] with offset=[" + result
//                        .getRecordMetadata().offset() + "]");
//            } else {
//                System.out.println("Unable to send message=[" + message + "] due to : " + er.getMessage());
//            }
//        });
//    }


    public void sendObjectToTopic(Customer customer) {
        try{
            CompletableFuture<SendResult<String, Customer>> future = template.send("ms-example-spring-topic-05", customer);
            future.whenComplete((result, er) -> {
                if (er == null) {
                    System.out.println("Sent Message=[" + customer.toString() + "] with offset=[" + result
                            .getRecordMetadata().offset() + "]");
                } else {
                    System.out.println("Unable to send message=[" + customer.toString() + "] due to : " + er.getMessage());
                }
            });
        }catch (Exception exception){
            log.info("Exception: {}",exception);
        }
    }
}
