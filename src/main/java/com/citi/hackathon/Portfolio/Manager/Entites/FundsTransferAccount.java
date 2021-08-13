package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;

@Entity
@Table(name = "Funds Transfer Account")
public class FundsTransferAccount {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FundsTransferAccountID")
    private Integer id;

    @Column(name = "Funds")
    private double funds;

    @Column(name = "Transfer Type")
    private String transferType;


    @Column(name = "Cash Account ID")
    private Integer cashAccountID;

    @Column(name = "Investment Account ID")
    private Integer investmentAccountId;

    public FundsTransferAccount(Integer fundsTransferAccountID, double funds, String transferType, Integer cashAccountID, Integer investmentAccountId) {
        this.id = fundsTransferAccountID;
        this.funds = funds;
        this.transferType = transferType;
        this.cashAccountID = cashAccountID;
        this.investmentAccountId = investmentAccountId;
    }

    public FundsTransferAccount() {

    }

    public Integer getFundsTransferAccountID() {
        return id;
    }

    public void setFundsTransferAccountID(Integer fundsTransferAccountID) {
        this.id = fundsTransferAccountID;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public Integer getCashAccountID() {
        return cashAccountID;
    }

    public void setCashAccountID(Integer cashAccountID) {
        this.cashAccountID = cashAccountID;
    }

    public Integer getInvestmentAccountId() {
        return investmentAccountId;
    }

    public void setInvestmentAccountId(Integer investmentAccountId) {
        this.investmentAccountId = investmentAccountId;
    }



}
