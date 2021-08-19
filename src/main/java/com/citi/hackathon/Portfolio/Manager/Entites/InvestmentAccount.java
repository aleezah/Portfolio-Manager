package com.citi.hackathon.Portfolio.Manager.Entites;

import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Investment Account")
public class InvestmentAccount implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "InvestmentAccountID")
    private int InvestmentAccountID;

    @Column(name = "Funds")
    private double Funds;


    // get and set methods


    public int getInvestmentAccountID() {
        return InvestmentAccountID;
    }

    public double getFunds() {
        return Funds;
    }

    public void setInvestmentAccountID(int investmentAccountID) {
        InvestmentAccountID = investmentAccountID;
    }

    public void setFunds(float funds) {
        Funds = funds;
    }

    // constructor
    public InvestmentAccount(double funds){
        this.Funds = funds;
    }

    // add connection to stock
    @JoinColumn(name = "investmentaccountID", referencedColumnName = "InvestmentAccountID")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Stocks> listOfStocks= new ArrayList<Stocks>();

    public List<Stocks> getListOfStocks() {
        return listOfStocks;
    }

    public void setListOfStocks(List<Stocks> listOfStocks) {
        this.listOfStocks = listOfStocks;
    }


    // add connection to stock transaction
    @JoinColumn(name = "investmentAccountID", referencedColumnName = "InvestmentAccountID")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<StockTransaction> listOfTransaction = new ArrayList<StockTransaction>();

    public List<StockTransaction> getListOfTransaction() {
        return listOfTransaction;
    }

    public void setListOfTransaction(List<StockTransaction> listOfTransaction) {
        this.listOfTransaction = listOfTransaction;
    }

}
