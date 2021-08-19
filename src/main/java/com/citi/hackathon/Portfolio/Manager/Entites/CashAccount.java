package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CashAccount")

public class CashAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CashAccountID")
    private Integer id;
    @Column(name = "Funds")
    private Double Funds;

    @Column(name = "AccountType")
    private String accountType;

    public CashAccount(int i, double f,String t){
        id=i;
        Funds=f;
        accountType=t;

    }

    public CashAccount() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFunds() {
        return Funds;
    }

    public void setFunds(Double funds) {
        Funds = funds;
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    //Adding Relationship
//FINISH WHEN DONE

    @JoinColumn(name = "cashAccountID", referencedColumnName = "CashAccountID")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<FundsTransferAccount> fundsTransfer= new ArrayList<FundsTransferAccount>();

    public List<FundsTransferAccount> getFundsTransfer() {
        return fundsTransfer;
    }

    public void setListOfTransaction(List<FundsTransferAccount> funds) {
        this.fundsTransfer = funds;
    }


}
