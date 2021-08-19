package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "futures")
public class Futures implements Serializable {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "futures_id")
    private Integer id;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "name")
    private String name;

    @Column(name = "time_bought")
    private Date timeBought;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Column(name = "number_of_futures")
    private Integer numberOfFutures;

    @Column(name = "investment_account_id_f")
    private Integer investmentAccountId;


    //Getter and Setter
    public Integer getFuturesID() {
        return id;
    }

    public void setFuturesID(Integer futuresID) {
        this.id = futuresID;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
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
    public Futures(Integer futuresID, Date timeBought, Date expireD, String name, Double purchasePrice, Integer numberOfFutures, Integer investmentAccountId) {
        this.id = futuresID;
        this.expiryDate = expireD;
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