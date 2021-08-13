package com.citi.hackathon.Portfolio.Manager.Entites;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ETF")
public class ETF {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "etfID")
    private int etfID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "PurchasePrice")
    private Double PurchasePrice;

    //there is a typo in the name of this one?
    @Column(name = "InvestmentAccountIETF")
    private  int InvestmentAccountIDETF;

    @Column(name = "TimeBought")
    private Date TimeBought;

    //sql has a typo
    @Column(name = "NumeberOfETF")
    private int NumberOfETF;

    //get and set methods

    public int getEtfID() {
        return etfID;
    }

    public Date getTimeBought() {
        return TimeBought;
    }

    public Double getPurchasePrice() {
        return PurchasePrice;
    }

    public int getInvestmentAccountIDETF() {
        return InvestmentAccountIDETF;
    }

    public int getNumberOfETF() {
        return NumberOfETF;
    }

    public String getName() {
        return Name;
    }

    public void setEtfID(int etfID) {
        this.etfID = etfID;
    }

    public void setInvestmentAccountIDETF(int investmentAccountIDETF) {
        InvestmentAccountIDETF = investmentAccountIDETF;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumberOfETF(int numberOfETF) {
        NumberOfETF = numberOfETF;
    }

    public void setPurchasePrice(Double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public void setTimeBought(Date timeBought) {
        TimeBought = timeBought;
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


//    CREATE TABLE IF NOT EXISTS `mydb`.`ETF` (
//        `etfID` INT NOT NULL,
//        `Name` VARCHAR(45) NOT NULL,
//        `PurchasePrice` DECIMAL(2) NOT NULL,
//        `InvestmentAccountIETF` INT NOT NULL,
//        `TimeBought` DATETIME NOT NULL,
//        `NumeberOfETF` INT NOT NULL,
//        PRIMARY KEY (`etfID`),
//        UNIQUE INDEX `etfID_UNIQUE` (`etfID` ASC) VISIBLE,
//        CONSTRAINT `InvestmentAccountID`
//        FOREIGN KEY (`InvestmentAccountIETF`)
//        REFERENCES `mydb`.`Investment Account` (`InvestmentAccountID`)
//        ON DELETE NO ACTION
//        ON UPDATE NO ACTION)
//        ENGINE = InnoDB;