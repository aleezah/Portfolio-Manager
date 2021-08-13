package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;

@Entity
@Table(name="CashAccount")

public class CashAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Funds")
    private Double Funds;

    @Column(name = "Account Type")
    private String accountType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
