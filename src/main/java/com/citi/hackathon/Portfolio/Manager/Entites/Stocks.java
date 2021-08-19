package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "stocks")
public class Stocks implements Serializable {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stockid")
    private Integer stockid;

    @Column(name = "timebought")
    private Date timebought;

    @Column(name = "stockname")
    private String stockname;

    @Column(name = "purchaseprice")
    private Double purchaseprice;

    @Column(name = "numberofstocks")
    private Integer numberofstocks;

    @Column(name = "investmentaccountids")
    private Integer investmentaccountids;


   // Getter setter


    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Date getTimebought() {
        return timebought;
    }

    public void setTimebought(Date timebought) {
        this.timebought = timebought;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public Double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Integer getNumberofstocks() {
        return numberofstocks;
    }

    public void setNumberofstocks(Integer numberofstocks) {
        this.numberofstocks = numberofstocks;
    }

    public Integer getInvestmentaccountids() {
        return investmentaccountids;
    }

    public void setInvestmentaccountids(Integer investmentaccountids) {
        this.investmentaccountids = investmentaccountids;
    }

    //Constructors

    public Stocks(Integer stockid, Date timebought, String stockname, Double purchaseprice, Integer numberofstocks, Integer investmentaccountids) {
        this.stockid = stockid;
        this.timebought = timebought;
        this.stockname = stockname;
        this.purchaseprice = purchaseprice;
        this.numberofstocks = numberofstocks;
        this.investmentaccountids = investmentaccountids;
        //this.listOfTransaction = listOfTransaction;
    }

    public Stocks() {
    }


    //Adding Relationship
/*
    @JoinColumn(name = "stockid", referencedColumnName = "stockid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<StockTransaction> listOfTransaction = new ArrayList<StockTransaction>();

    public List<StockTransaction> getListOfTransaction() {
        return listOfTransaction;
    }

    public void setListOfTransaction(List<StockTransaction> listOfTransaction) {
        this.listOfTransaction = listOfTransaction;
    }

 */
}
