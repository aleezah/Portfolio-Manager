package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="investmentaccounthistory")
public class InvestmentAccountHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "investmentaccounthistoryid")
    private Integer investmentaccounthistoryid;
    @Column(name = "investmentaccountid")
    private Integer investmentaccountid;
    @Column(name = "investedvalue")
    private Double investedvalue;
    @Column(name = "currentvalue")
    private Double currentvalue;
    @Column(name = "entrydate")
    private Date entrydate;

    // Getter and Setter


    public Integer getInvestmentaccounthistoryid() {
        return investmentaccounthistoryid;
    }

    public void setInvestmentaccounthistoryid(Integer investmentaccounthistoryid) {
        this.investmentaccounthistoryid = investmentaccounthistoryid;
    }

    public Integer getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setInvestmentaccountid(Integer investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public Double getInvestedvalue() {
        return investedvalue;
    }

    public void setInvestedvalue(Double investedvalue) {
        this.investedvalue = investedvalue;
    }

    public Double getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(Double currentvalue) {
        this.currentvalue = currentvalue;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    // Constructors


    public InvestmentAccountHistory(Integer investmentaccountid, Double investedvalue, Double currentvalue, Date entrydate) {
        this.investmentaccountid = investmentaccountid;
        this.investedvalue = investedvalue;
        this.currentvalue = currentvalue;
        this.entrydate = entrydate;
    }

    public InvestmentAccountHistory() {
    }
}
