package com.example.secondmicroservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/apiTwo")
public class Controller {


     @Autowired
     private RestTemplate restTemplate;
    @GetMapping("/getFromSecond")
    public String get(){
    String str  = restTemplate.getForObject("http://localhost:9091/apiOne/getFromFirst" ,String.class);
        return str  + " Microservice-Second";
    }
}
