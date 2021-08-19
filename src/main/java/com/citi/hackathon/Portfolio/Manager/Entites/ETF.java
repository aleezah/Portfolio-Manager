package com.citi.hackathon.Portfolio.Manager.Entites;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="etf")
public class ETF {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "etf_id")
    private Integer etfID;

    @Column(name = "name")
    private String name;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    //there is a typo in the name of this one?
    @Column(name = "investment_account_id_etf")
    private  Integer investmentAccountIDETF;

    @Column(name = "time_bought")
    private Date timeBought;

    //sql has a typo
    @Column(name = "numeber_of_etf")
    private int numberOfETF;

    public ETF() {

    }

    //get and set methods

    public Integer getEtfID() {
        return etfID;
    }

    public Date getTimeBought() {
        return timeBought;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Integer getInvestmentAccountIDETF() {
        return investmentAccountIDETF;
    }

    public Integer getNumberOfETF() {
        return numberOfETF;
    }

    public String getName() {
        return name;
    }

    public void setEtfID(int etfID) {
        this.etfID = etfID;
    }

    public void setInvestmentAccountIDETF(int investmentAccountIDETF) {
        this.investmentAccountIDETF = investmentAccountIDETF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfETF(int numberOfETF) {
        this.numberOfETF = numberOfETF;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setTimeBought(Date timeBought) {
        this.timeBought = timeBought;
    }


    // constructor
    public ETF(String name, Double purchasePrice, Integer investmentAccountIDETF, Date timeBought, Integer numberOfETF){
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.investmentAccountIDETF = investmentAccountIDETF;
        this.timeBought = timeBought;
        this.numberOfETF = numberOfETF;
    }


    //    //Adding Relationship
//
//    @JoinColumn(name = "InvestmentAccountIETF", referencedColumnName = "InvestmentAccountID")
//    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
//    private List<StockTransaction> listOfTransaction = new ArrayList<StockTransaction>();
//
//    public List<StockTransaction> getListOfTransaction() {
//        return listOfTransaction;
//    }
//
//    public void setListOfTransaction(List<StockTransaction> listOfTransaction) {
//        this.listOfTransaction = listOfTransaction;
//    }

}
