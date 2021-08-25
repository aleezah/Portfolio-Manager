package com.citi.hackathon.Portfolio.Manager.Entites;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "efttransaction")
public class EtfTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etftransactionid")
    private Integer etftransactionid;

    @Column(name = "numberofetf")
    private Integer numberofetf;

    @Column(name = "etfid")
    private Integer etfid;

    @Column(name = "etfinvestmentacc")
    private Integer etfinvestmentacc;

    @Column(name = "etftransactionamount")
    private Double etftransactionamount;

    @Column(name = "eftname")
    private String eftname;

    @Column(name = "etftransactiontype")
    private String etftransactiontype;

    @Column(name = "etftransactiontime")
    private Date etftransactiontime;

    //getter and setter


    public Integer getEtftransactionid() {
        return etftransactionid;
    }

    public void setEtftransactionid(Integer etftransactionid) {
        this.etftransactionid = etftransactionid;
    }

    public Integer getNumberofetf() {
        return numberofetf;
    }

    public void setNumberofetf(Integer numberofetf) {
        this.numberofetf = numberofetf;
    }

    public Integer getEtfid() {
        return etfid;
    }

    public void setEtfid(Integer etfid) {
        this.etfid = etfid;
    }

    public Integer getEtfinvestmentacc() {
        return etfinvestmentacc;
    }

    public void setEtfinvestmentacc(Integer etfinvestmentacc) {
        this.etfinvestmentacc = etfinvestmentacc;
    }

    public Double getEtftransactionamount() {
        return etftransactionamount;
    }

    public void setEtftransactionamount(Double etftransactionamount) {
        this.etftransactionamount = etftransactionamount;
    }

    public String getEftname() {
        return eftname;
    }

    public void setEftname(String eftname) {
        this.eftname = eftname;
    }

    public String getEtftransactiontype() {
        return etftransactiontype;
    }

    public void setEtftransactiontype(String etftransactiontype) {
        this.etftransactiontype = etftransactiontype;
    }

    public Date getEtftransactiontime() {
        return etftransactiontime;
    }

    public void setEtftransactiontime(Date etftransactiontime) {
        this.etftransactiontime = etftransactiontime;
    }

    //constructors


    public EtfTransaction(Integer etftransactionid, Integer numberofetf, Integer etfid, Integer etfinvestmentacc, Double etftransactionamount, String eftname, String etftransactiontype, Date etftransactiontime) {
        this.etftransactionid = etftransactionid;
        this.numberofetf = numberofetf;
        this.etfid = etfid;
        this.etfinvestmentacc = etfinvestmentacc;
        this.etftransactionamount = etftransactionamount;
        this.eftname = eftname;
        this.etftransactiontype = etftransactiontype;
        this.etftransactiontime = etftransactiontime;
    }

    public EtfTransaction() {
    }

}
