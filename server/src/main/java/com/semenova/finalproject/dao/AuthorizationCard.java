package com.semenova.finalproject.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AuthorizationCard implements Authorization {
    @Override
    /* Реализовать проверку номер карты и пин код */
    public int checkLogin(int cardNumber, int pinCode) {
        return 0;
    }
}
