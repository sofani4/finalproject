package com.semenova.finalproject.entity;

import com.semenova.finalproject.ServerApplication;
import com.semenova.finalproject.service.CardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = ServerApplication.class)
@SpringBootTest
class CardTest {

    @Autowired
    CardService cardService;

    @Test
    public void getCardBalanceTest() {
        Card card1 = new Card(1, 15232, 1324, 56007.67, "RUB", 1);
        Card card2 = new Card(2, 23453, 2341, 1237.37, "RUB", 1);
        assertEquals( "Баланс вашей карты 56007.67 RUB", cardService.getCardBalance(1));
        assertNotEquals( "Баланс вашей карты 56007.67 RUB", cardService.getCardBalance(2));
    }
}
