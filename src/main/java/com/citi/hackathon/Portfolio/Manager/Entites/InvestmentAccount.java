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

    public String getInvestmentaccname() {
        return investmentaccname;
    }

    public void setInvestmentaccname(String investmentaccname) {
        this.investmentaccname = investmentaccname;
    }

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
    private List<StockTransaction> listOfStockTransaction = new ArrayList<StockTransaction>();

    public List<StockTransaction> getListOfStockTransaction() {
        return listOfStockTransaction;
    }

    public void setListOfStockTransaction(List<StockTransaction> listOfStockTransaction) {
        this.listOfStockTransaction = listOfStockTransaction;
    }

    // Relation between Investment Account and ETF
    @JoinColumn(name = "investmentaccountidetf", referencedColumnName = "investmentaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<ETF> listOfETF = new ArrayList<ETF>();

    public List<ETF> getListOfETF() {
        return listOfETF;
    }

    public void setListOfETF(List<ETF> listOfETF) {
        this.listOfETF = listOfETF;
    }

    // Relation between Investment Account and ETF transactions
    @JoinColumn(name = "etfinvestmentacc", referencedColumnName = "investmentaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<EtfTransaction> listOfEtfTransaction = new ArrayList<EtfTransaction>();

    public List<EtfTransaction> getListOfEtfTransaction() {
        return listOfEtfTransaction;
    }

    public void setListOfEtfTransaction(List<EtfTransaction> listOfEtfTransaction) {
        this.listOfEtfTransaction = listOfEtfTransaction;
    }


    // Relation between Investment Account and Futures
    @JoinColumn(name = "investmentaccountidf", referencedColumnName = "investmentaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Futures> listOfFutures = new ArrayList<Futures>();

    public List<Futures> getListOfFutures() {
        return listOfFutures;
    }

    public void setListOfFutures(List<Futures> listOfFutures) {
        this.listOfFutures = listOfFutures;
    }

    // Relation between Investment Account and Futures transactions
    @JoinColumn(name = "futuresinvestmentaccid", referencedColumnName = "investmentaccountid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<FuturesTransaction> listOfFuturesTransaction = new ArrayList<FuturesTransaction>();

    public List<FuturesTransaction> getListOfFuturesTransaction() {
        return listOfFuturesTransaction;
    }

    public void setListOfFuturesTransaction(List<FuturesTransaction> listOfFuturesTransaction) {
        this.listOfFuturesTransaction = listOfFuturesTransaction;
    }

}
