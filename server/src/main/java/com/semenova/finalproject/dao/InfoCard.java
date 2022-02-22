package com.semenova.finalproject.dao;


import com.semenova.finalproject.entity.Card;

public interface InfoCard {
    public Card getCard(int id);
    public String getCardBalance(int id);
}
