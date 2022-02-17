package com.semenova.finalproject.dao;


import com.semenova.finalproject.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CardDAO implements InfoCard {
    @Autowired
    private EntityManager entityManager;

    @Override
    public Card getCard(int id) {
        Card card = entityManager.find(Card.class, id);
        return card;
    }

    @Override
    public String getCardBalance(int id) {
        Card card = entityManager.find(Card.class, id);
        return "Баланс вашей карты " + card.getBalance() + " " + card.getCurrency();
    }
}
