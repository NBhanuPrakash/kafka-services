package ms_example_producer_v0.controller;

import ms_example_producer_v0.dto.Customer;
import ms_example_producer_v0.service.KafkaMessagePublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisherService publisher;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message){
        try{
            for (int i=0; i<=20000; i++){
//                publisher.sendMessageToTopic(message+" : "+i);
            }
            return ResponseEntity.noContent().build();
        }catch (Exception exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/publish")
    public void publishObject(@RequestBody Customer customer){
        publisher.sendObjectToTopic(customer);
    }
}
