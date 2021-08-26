package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="cashaccounthistory")
public class CashAccountHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cashaccounthistoryid")
    private Integer cashaccounthistoryid;
    @Column(name = "cashaccountid")
    private Integer cashaccountid;
    @Column(name = "entrydate")
    private Date entrydate;
    @Column(name = "totalvalue")
    private Double totalvalue;

    // getter and setter

    public Integer getCashaccounthistoryid() {
        return cashaccounthistoryid;
    }

    public void setCashaccounthistoryid(Integer cashaccounthistoryid) {
        this.cashaccounthistoryid = cashaccounthistoryid;
    }

    public Integer getCashaccountid() {
        return cashaccountid;
    }

    public void setCashaccountid(Integer cashaccountid) {
        this.cashaccountid = cashaccountid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(Double totalvalue) {
        this.totalvalue = totalvalue;
    }

    // Constructors


    public CashAccountHistory(Integer cashaccountid, Date entrydate, Double totalvalue) {
        this.cashaccountid = cashaccountid;
        this.entrydate = entrydate;
        this.totalvalue = totalvalue;
    }

    public CashAccountHistory() {
    }
}
