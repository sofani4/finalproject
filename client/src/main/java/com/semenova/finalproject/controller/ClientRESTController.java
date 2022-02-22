package com.semenova.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ATM")
public class ClientRESTController {
    @RequestMapping("/")
    public String home(){
        return "Hello User ATM!";
    }

    @GetMapping("/card/{cardId}")
    public String getCard(@PathVariable("cardId") int cardId) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://127.0.0.1:8080/host/card/" + cardId + "/balance", String.class);
        return result;
    }
}
