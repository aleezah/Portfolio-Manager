package com.citi.hackathon.Portfolio.Manager.Entites;

import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="investmentaccount")
public class InvestmentAccount implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "investmentaccountid")
    private int investmentaccountid;

    @Column(name = "funds")
    private double funds;

    @Column(name = "investmentaccname")
    private String investmentaccname;

    public InvestmentAccount(double funds, String investmentaccname ) {
        this.investmentaccname = investmentaccname;
        this.funds = funds;
    }



    public int getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setInvestmentaccountid(int investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public InvestmentAccount() {

    }



    // add connection to stock
    @JoinColumn(name = "investmentaccountids", referencedColumnName = "investmentaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Stocks> listOfStocks= new ArrayList<Stocks>();

    public List<Stocks> getListOfStocks() {
        return listOfStocks;
    }

    public void setListOfStocks(List<Stocks> listOfStocks) {
        this.listOfStocks = listOfStocks;
    }


    // add connection to stock transaction
    @JoinColumn(name = "investmentaccountidtx", referencedColumnName = "investmentaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<StockTransaction> listOfTransaction = new ArrayList<StockTransaction>();

    public List<StockTransaction> getListOfTransaction() {
        return listOfTransaction;
    }

    public void setListOfTransaction(List<StockTransaction> listOfTransaction) {
        this.listOfTransaction = listOfTransaction;
    }

}
