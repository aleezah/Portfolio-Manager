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
    @Column(name = "etfid")
    private Integer etfid;

    @Column(name = "etfname")
    private String etfname;

    @Column(name = "purchaseprice")
    private Double purchaseprice;

    @Column(name = "timebought")
    private Date timebought;

    //sql has a typo
    @Column(name = "numeberofetf")
    private int numberofetf;

    //there is a typo in the name of this one?
    @Column(name = "investmentaccountidetf")
    private  Integer investmentaccountidetf;

    public Integer getEtfid() {
        return etfid;
    }

    public void setEtfid(Integer etfid) {
        this.etfid = etfid;
    }

    public String getEtfname() {
        return etfname;
    }

    public void setEtfname(String etfname) {
        this.etfname = etfname;
    }

    public Double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Integer getInvestmentaccountidetf() {
        return investmentaccountidetf;
    }

    public void setInvestmentaccountidetf(Integer investmentaccountidetf) {
        this.investmentaccountidetf = investmentaccountidetf;
    }

    public Date getTimebought() {
        return timebought;
    }

    public void setTimebought(Date timebought) {
        this.timebought = timebought;
    }

    public int getNumberofetf() {
        return numberofetf;
    }

    public void setNumberofetf(int numberofetf) {
        this.numberofetf = numberofetf;
    }



    public ETF(Integer etfid, String etfname, Double purchaseprice, Integer investmentaccountidetf, Date timebought, int numberofetf) {
        this.etfid = etfid;
        this.etfname = etfname;
        this.purchaseprice = purchaseprice;
        this.investmentaccountidetf = investmentaccountidetf;
        this.timebought = timebought;
        this.numberofetf = numberofetf;
    }


    public ETF(String etfname, Double purchaseprice, Date timebought, int numberofetf, Integer investmentaccountidetf) {
        this.etfname = etfname;
        this.purchaseprice = purchaseprice;
        this.timebought = timebought;
        this.numberofetf = numberofetf;
        this.investmentaccountidetf = investmentaccountidetf;
    }

    public ETF() {

    }

    //get and set methods



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
