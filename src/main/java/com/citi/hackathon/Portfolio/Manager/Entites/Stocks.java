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
    @Column(name = "StockID")
    private Integer stockID;

    @Column(name = "TimeBought")
    private Date timeBought;

    @Column(name = "Name")
    private String name;

    @Column(name = "Purchase Price")
    private Double purchasePrice;

    @Column(name = "NumberOfStocks")
    private Integer numberOfStocks;

    @Column(name = "investmentaccountID")
    private Integer investmentAccountId;


    //Getter and Setter
    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public Date getTimeBought() {
        return timeBought;
    }

    public void setTimeBought(Date timeBought) {
        this.timeBought = timeBought;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(Integer numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public Integer getInvestmentAccountId() {
        return investmentAccountId;
    }

    public void setInvestmentAccountId(Integer investmentAccountId) {
        this.investmentAccountId = investmentAccountId;
    }


    //Constructors
    public Stocks(Integer stockID, Date timeBought, String name, Double purchasePrice, Integer numberOfStocks, Integer investmentAccountId) {
        this.stockID = stockID;
        this.timeBought = timeBought;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.numberOfStocks = numberOfStocks;
        this.investmentAccountId = investmentAccountId;
    }

    public Stocks() {
    }

    //Adding Relationship

    @JoinColumn(name = "StockID", referencedColumnName = "StockID")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<StockTransaction> listOfTransaction = new ArrayList<StockTransaction>();

    public List<StockTransaction> getListOfTransaction() {
        return listOfTransaction;
    }

    public void setListOfTransaction(List<StockTransaction> listOfTransaction) {
        this.listOfTransaction = listOfTransaction;
    }
}
