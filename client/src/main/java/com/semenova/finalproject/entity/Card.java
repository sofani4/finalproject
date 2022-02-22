package com.semenova.finalproject.entity;

import lombok.Data;

/* Класс для инициализации карты */
@Data
public class Card {
    private int id;
    private String cardNumber;
    private String pinCode;

    public Card(int id, String cardNumber, String pinCode) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }
}