package com.producer.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @RequestMapping("/producer/demo")
    public String produce(){
        return "producer";
    }
}