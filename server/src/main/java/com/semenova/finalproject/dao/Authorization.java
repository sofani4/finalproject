package com.semenova.finalproject.dao;

import java.util.List;

public interface Authorization {
    public int checkLogin(int cardNumber, int pinCode);
}