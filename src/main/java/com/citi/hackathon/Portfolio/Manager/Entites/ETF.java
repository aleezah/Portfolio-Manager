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
    @Column(name = "numberofetf")
    private int numberofetf;

    //there is a typo in the name of this one?
    @Column(name = "investmentaccountidetf")
    private  Integer investmentaccountidetf;

    //get and set methods

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



    //Constructors


    public ETF(String etfname, Double purchaseprice, Date timebought, int numberofetf, Integer investmentaccountidetf) {
        this.etfname = etfname;
        this.purchaseprice = purchaseprice;
        this.timebought = timebought;
        this.numberofetf = numberofetf;
        this.investmentaccountidetf = investmentaccountidetf;
    }

    public ETF() {

    }


    //    //Adding Relationship
    @JoinColumn(name = "etfid", referencedColumnName = "etfid")
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<EtfTransaction> listOfEtfTransaction = new ArrayList<EtfTransaction>();

    public List<EtfTransaction> getListOfEtfTransaction() {
        return listOfEtfTransaction;
    }

    public void setListOfEtfTransaction(List<EtfTransaction> listOfEtfTransaction) {
        this.listOfEtfTransaction = listOfEtfTransaction;
    }
}
