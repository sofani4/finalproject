package com.semenova.finalproject.service;

import com.semenova.finalproject.entity.Card;


public interface CardService {
    public Card getCard(int id);
    public String getCardBalance(int id);
}
