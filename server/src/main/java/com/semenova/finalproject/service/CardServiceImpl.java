package com.semenova.finalproject.service;

import com.semenova.finalproject.dao.InfoCard;
import com.semenova.finalproject.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
// Временное название с окончанием Impl
public class CardServiceImpl implements CardService {

    @Autowired
    private InfoCard infoCard;

    @Override
    @Transactional
    public Card getCard(int id) {
        return infoCard.getCard(id);
    }

    @Override
    @Transactional
    public String getCardBalance(int id) {
        return infoCard.getCardBalance(id);
    }
}
