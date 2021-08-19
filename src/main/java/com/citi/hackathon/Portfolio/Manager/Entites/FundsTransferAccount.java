package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;

@Entity
@Table(name = "funds_transfer_account")
public class FundsTransferAccount {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funds_transfer_account_id")
    private Integer id;

    @Column(name = "funds")
    private double funds;

    @Column(name = "transfer_type")
    private String transferType;

    @Column(name = "investment_account_id_ft")
    private Integer investmentAccountId;

    @Column(name = "cash_account_id_ft")
    private Integer cashAccountID;



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

    public void setCashAccountID(Integer cashAccount) {
        this.cashAccountID = cashAccount;
    }

    public Integer getInvestmentAccountId() {
        return investmentAccountId;
    }

    public void setInvestmentAccountId(Integer investmentAccount) {
        this.investmentAccountId = investmentAccount;
    }



}
