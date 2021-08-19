package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;

@Entity
@Table(name = "fundstransferaccount")
public class FundsTransferAccount {

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fundstransferaccountid")
    private Integer fundstransferaccountid;

    @Column(name = "funds")
    private double funds;

    @Column(name = "transfertype")
    private String transfertype;

    @Column(name = "investmentaccountidft")
    private Integer investmentaccountidft;

    @Column(name = "cashaccountidft")
    private Integer cashaccountidft;

    public FundsTransferAccount(Integer fundstransferaccountid, double funds, String transfertype, Integer investmentaccountidft, Integer cashaccountidft) {
        this.fundstransferaccountid = fundstransferaccountid;
        this.funds = funds;
        this.transfertype = transfertype;
        this.investmentaccountidft = investmentaccountidft;
        this.cashaccountidft = cashaccountidft;
    }

    public FundsTransferAccount() {

    }

    public Integer getFundstransferaccountid() {
        return fundstransferaccountid;
    }

    public void setFundstransferaccountid(Integer fundstransferaccountid) {
        this.fundstransferaccountid = fundstransferaccountid;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public String getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype;
    }

    public Integer getInvestmentaccountidft() {
        return investmentaccountidft;
    }

    public void setInvestmentaccountidft(Integer investmentaccountidft) {
        this.investmentaccountidft = investmentaccountidft;
    }

    public Integer getCashaccountidft() {
        return cashaccountidft;
    }

    public void setCashaccountidft(Integer cashaccountidft) {
        this.cashaccountidft = cashaccountidft;
    }
}
