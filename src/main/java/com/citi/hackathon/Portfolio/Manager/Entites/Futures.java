package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "futures")
public class Futures implements Serializable {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "futuresid")
    private Integer futuresid;

    @Column(name = "expirydate")
    private Date expirydate;

    @Column(name = "futuresname")
    private String futuresname;

    @Column(name = "timebought")
    private Date timebought;

    @Column(name = "purchaseprice")
    private Double purchaseprice;

    @Column(name = "numberoffutures")
    private Integer numberoffutures;

    @Column(name = "investmentaccountidf")
    private Integer investmentaccountidf;

    public Futures(Integer futuresid, Date expirydate, String futuresname, Date timebought, Double purchaseprice, Integer numberoffutures, Integer investmentaccountidf) {
        this.futuresid = futuresid;
        this.expirydate = expirydate;
        this.futuresname = futuresname;
        this.timebought = timebought;
        this.purchaseprice = purchaseprice;
        this.numberoffutures = numberoffutures;
        this.investmentaccountidf = investmentaccountidf;
    }

    public Integer getFuturesid() {
        return futuresid;
    }

    public void setFuturesid(Integer futuresid) {
        this.futuresid = futuresid;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public String getFuturesname() {
        return futuresname;
    }

    public void setFuturesname(String futuresname) {
        this.futuresname = futuresname;
    }

    public Date getTimebought() {
        return timebought;
    }

    public void setTimebought(Date timebought) {
        this.timebought = timebought;
    }

    public Double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Integer getNumberoffutures() {
        return numberoffutures;
    }

    public void setNumberoffutures(Integer numberoffutures) {
        this.numberoffutures = numberoffutures;
    }

    public Integer getInvestmentaccountidf() {
        return investmentaccountidf;
    }

    public void setInvestmentaccountidf(Integer investmentaccountidf) {
        this.investmentaccountidf = investmentaccountidf;
    }

    public Futures() {
    }

    //Adding Relationship


    @JoinColumn(name = "futuresid", referencedColumnName = "futuresid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<FuturesTransaction> listOfFuturesTransaction = new ArrayList<FuturesTransaction>();

    public List<FuturesTransaction> getListOfFuturesTransaction() {
        return listOfFuturesTransaction;
    }

    public void setListOfFuturesTransaction(List<FuturesTransaction> listOfFuturesTransaction) {
        this.listOfFuturesTransaction = listOfFuturesTransaction;
    }


}