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
    @Column(name = "cashaccname")
    private String cashaccname;


    public CashAccount( Double funds, String accounttype, String cashaccname) {

        this.funds = funds;
        this.accounttype = accounttype;
        this.cashaccname = cashaccname;
    }
    public CashAccount() {

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

    public String getCashaccname() {
        return cashaccname;
    }

    public void setCashaccname(String cashaccname) {
        this.cashaccname = cashaccname;
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
