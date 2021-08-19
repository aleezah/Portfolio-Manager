package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cashaccount")

public class CashAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cashaccountid")
    private Integer cashaccountid;
    @Column(name = "funds")
    private Double funds;
    @Column(name = "accounttype")
    private String accounttype;

    public CashAccount() {

    }

    public CashAccount(Integer cashaccountid, Double funds, String accounttype) {
        this.cashaccountid = cashaccountid;
        this.funds = funds;
        this.accounttype = accounttype;
    }

    public Integer getCashaccountid() {
        return cashaccountid;
    }

    public void setCashaccountid(Integer cashaccountid) {
        this.cashaccountid = cashaccountid;
    }

    public Double getFunds() {
        return funds;
    }

    public void setFunds(Double funds) {
        this.funds = funds;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accountype) {
        this.accounttype = accountype;
    }




//Adding Relationship
//FINISH WHEN DONE
/*
    @JoinColumn(name = "cashaccountid", referencedColumnName = "cashaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<FundsTransferAccount> fundsTransfer= new ArrayList<FundsTransferAccount>();

    public List<FundsTransferAccount> getFundsTransfer() {
        return fundsTransfer;
    }

    public void setListOfTransaction(List<FundsTransferAccount> funds) {
        this.fundsTransfer = funds;
    }

*/
}
