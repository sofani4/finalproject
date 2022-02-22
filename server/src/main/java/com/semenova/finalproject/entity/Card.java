package com.semenova.finalproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Currency;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="card_number")
    private int cardNumber;
    @Column(name="password")
    private int password;
    @Column(name="balance")
    private double balance;
    @Column(name="currency")
    private Currency currency;
    @Column(name="id_client")
    private int idClient;


    public Card(int id, int cardNumber, int password, double balance, String currency, int id_client) {
    }
}
