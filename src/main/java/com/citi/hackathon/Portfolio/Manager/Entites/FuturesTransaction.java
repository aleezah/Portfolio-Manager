package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "futurestransaction")
public class FuturesTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "futurestransactionid")
    private Integer futurestransactionid;

    @Column(name = "futuresid")
    private Integer futuresid;

    @Column(name = "futuresinvestmentaccid")
    private Integer futuresinvestmentaccid;

    @Column(name = "numberoffutures")
    private Integer numberoffutures;

    @Column(name = "futurestransactionamount")
    private Double futurestransactionamount;

    @Column(name = "futurestransactiontype")
    private String futurestransactiontype;

    @Column(name = "futuresname")
    private String futuresname;

    @Column(name = "futurestransactiontime")
    private Date futurestransactiontime;

    // Getter and Setter


    public Integer getFuturestransactionid() {
        return futurestransactionid;
    }

    public void setFuturestransactionid(Integer futurestransactionid) {
        this.futurestransactionid = futurestransactionid;
    }

    public Integer getFuturesid() {
        return futuresid;
    }

    public void setFuturesid(Integer futuresid) {
        this.futuresid = futuresid;
    }

    public Integer getFuturesinvestmentaccid() {
        return futuresinvestmentaccid;
    }

    public void setFuturesinvestmentaccid(Integer futuresinvestmentaccid) {
        this.futuresinvestmentaccid = futuresinvestmentaccid;
    }

    public Integer getNumberoffutures() {
        return numberoffutures;
    }

    public void setNumberoffutures(Integer numberoffutures) {
        this.numberoffutures = numberoffutures;
    }

    public Double getFuturestransactionamount() {
        return futurestransactionamount;
    }

    public void setFuturestransactionamount(Double futurestransactionamount) {
        this.futurestransactionamount = futurestransactionamount;
    }

    public String getFuturestransactiontype() {
        return futurestransactiontype;
    }

    public void setFuturestransactiontype(String futurestransactiontype) {
        this.futurestransactiontype = futurestransactiontype;
    }

    public String getFuturesname() {
        return futuresname;
    }

    public void setFuturesname(String futuresname) {
        this.futuresname = futuresname;
    }

    public Date getFuturestransactiontime() {
        return futurestransactiontime;
    }

    public void setFuturestransactiontime(Date futurestransactiontime) {
        this.futurestransactiontime = futurestransactiontime;
    }

    public FuturesTransaction( Integer futuresid, Integer futuresinvestmentaccid, Integer numberoffutures, Double futurestransactionamount, String futurestransactiontype, String futuresname, Date futurestransactiontime) {

        this.futuresid = futuresid;
        this.futuresinvestmentaccid = futuresinvestmentaccid;
        this.numberoffutures = numberoffutures;
        this.futurestransactionamount = futurestransactionamount;
        this.futurestransactiontype = futurestransactiontype;
        this.futuresname = futuresname;
        this.futurestransactiontime = futurestransactiontime;
    }

    public FuturesTransaction() {
    }
}
