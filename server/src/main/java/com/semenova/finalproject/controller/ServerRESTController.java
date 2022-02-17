package com.semenova.finalproject.controller;


import com.semenova.finalproject.entity.Card;
import com.semenova.finalproject.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/host")
public class ServerRESTController {
    @Autowired
    private CardService cardService;

    @RequestMapping("/")
    public String home(){
        return "Hello User host!";
    }

    // Вся информация о карте
    @GetMapping("/card/{id}")
    public Card getCard(@PathVariable int id) {
        Card card = cardService.getCard(id);
        return card;
    }

    // Только баланс карты с сообщением
    @GetMapping("/card/{id}/balance")
    public String getCardBalance(@PathVariable int id) {
        String cardBalance = cardService.getCardBalance(id);
        return cardBalance;
    }
}
