package com.citi.hackathon.Portfolio.Manager.Entites;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "stock transaction")
public class StockTransaction implements Serializable{

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionID")
    private Integer transactionID;

    @Column(name = "TransactionTime")
    private Date transactionTime;

    @Column(name = "Amount")
    private Double amount;

    @Column(name = "transactionType")
    private String transactionType;

    @Column(name = "StockName")
    private String stockName;

    @Column(name = "stockID")
    private Integer stockID;

    @Column(name = "investmentAccountID")
    private Integer investmentAccountID;


    //Getter and Setter
    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        stockID = stockID;
    }

    public Integer getInvestmentAccountID() {
        return investmentAccountID;
    }

    public void setInvestmentAccountID(Integer investmentAccountID) {
        this.investmentAccountID = investmentAccountID;
    }

    //Constructor

    public StockTransaction(Integer transactionID, Date transactionTime, Double amount, String transactionType, String stockName, Integer stockID, Integer investmentAccountID) {
        this.transactionID = transactionID;
        this.transactionTime = transactionTime;
        this.amount = amount;
        this.transactionType = transactionType;
        this.stockName = stockName;
        stockID = stockID;
        this.investmentAccountID = investmentAccountID;
    }

    public StockTransaction() {
    }
}
