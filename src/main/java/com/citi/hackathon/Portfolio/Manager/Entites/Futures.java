package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Futures")
public class Futures implements Serializable {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FuturesID")
    private Integer id;

    @Column(name = "TimeBought")
    private Date timeBought;

    @Column(name = "Name")
    private String name;

    @Column(name = "PurchasePrice")
    private Double purchasePrice;

    @Column(name = "NumberOfFutures")
    private Integer numberOfFutures;

    @Column(name = "InvestmentAccountID")
    private Integer investmentAccountId;


    //Getter and Setter
    public Integer getFuturesID() {
        return id;
    }

    public void setFuturesID(Integer futuresID) {
        this.id = futuresID;
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

    public Integer getNumberOfFutures() {
        return numberOfFutures;
    }

    public void setNumberOfFutures(Integer numberOfFutures) {
        this.numberOfFutures = numberOfFutures;
    }

    public Integer getInvestmentAccountId() {
        return investmentAccountId;
    }

    public void setInvestmentAccountId(Integer investmentAccountId) {
        this.investmentAccountId = investmentAccountId;
    }


    //Constructors
    public Futures(Integer futuresID, Date timeBought, String name, Double purchasePrice, Integer numberOfFutures, Integer investmentAccountId) {
        this.id = futuresID;
        this.timeBought = timeBought;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.numberOfFutures = numberOfFutures;
        this.investmentAccountId = investmentAccountId;
    }

    public Futures() {
    }

    //Adding Relationship


}