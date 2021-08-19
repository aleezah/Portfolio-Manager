package com.citi.hackathon.Portfolio.Manager.Entites;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "stocktransaction")
public class StockTransaction implements Serializable{

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionid")
    private Integer transactionid;

    @Column(name = "transactiontime")
    private Date transactiontime;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "transactiontype")
    private String transactiontype;

    @Column(name = "stockname")
    private String stockname;

    @Column(name = "stockid")
    private Integer stockid;

    @Column(name = "investmentaccountidtx")
    private Integer investmentaccountid;


    //Getter and Setter

    public Integer getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public Date getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(Date transactiontime) {
        this.transactiontime = transactiontime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setInvestmentaccountid(Integer investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    //Constructor


    public StockTransaction(Integer transactionid, Date transactiontime, Double amount, String transactiontype, String stockname, Integer stockid, Integer investmentaccountid) {
        this.transactionid = transactionid;
        this.transactiontime = transactiontime;
        this.amount = amount;
        this.transactiontype = transactiontype;
        this.stockname = stockname;
        this.stockid = stockid;
        this.investmentaccountid = investmentaccountid;
    }

    public StockTransaction() {
    }
}
