package com.citi.hackathon.Portfolio.Manager.Entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Investment Account")
public class InvestmentAccount implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int InvestmentAccountID;

    @Column
    private float Funds;

}

//    CREATE TABLE IF NOT EXISTS `mydb`.`Investment Account` (
//        `InvestmentAccountID` INT NOT NULL,
//        `Funds` DECIMAL(2) NOT NULL,
//        PRIMARY KEY (`InvestmentAccountID`),
//        UNIQUE INDEX `InvestmentAccountID_UNIQUE` (`InvestmentAccountID` ASC) VISIBLE)
//        ENGINE = InnoDB;

