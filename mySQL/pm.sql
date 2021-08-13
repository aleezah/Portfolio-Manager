-- MySQL Script generated by MySQL Workbench
-- Fri Aug 13 12:58:22 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`CashAccount`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CashAccount` (
                                                    `CashAccountID` INT NOT NULL,
                                                    `Funds` DECIMAL(2) NOT NULL,
    `AccountType` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`CashAccountID`),
    UNIQUE INDEX `CashAccountID_UNIQUE` (`CashAccountID` ASC) VISIBLE)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Investment Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Investment Account` (
                                                           `InvestmentAccountID` INT NOT NULL,
                                                           `Funds` DECIMAL(2) NOT NULL,
    PRIMARY KEY (`InvestmentAccountID`),
    UNIQUE INDEX `InvestmentAccountID_UNIQUE` (`InvestmentAccountID` ASC) VISIBLE)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`FundsTransferAccount`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`FundsTransferAccount` (
                                                             `FundsTransferAccountID` INT NOT NULL,
                                                             `Funds` DECIMAL(2) NOT NULL,
    `transferType` VARCHAR(45) NOT NULL,
    `investAccountID` INT NOT NULL,
    `cashAccountID` INT NOT NULL,
    PRIMARY KEY (`FundsTransferAccountID`),
    UNIQUE INDEX `FundsTransferAccountID_UNIQUE` (`FundsTransferAccountID` ASC) VISIBLE,
    CONSTRAINT `cashAccountID`
    FOREIGN KEY (`cashAccountID`)
    REFERENCES `mydb`.`CashAccount` (`CashAccountID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `investmentAccountID`
    FOREIGN KEY (`investAccountID`)
    REFERENCES `mydb`.`Investment Account` (`InvestmentAccountID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Stocks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Stocks` (
                                               `StockID` INT NOT NULL,
                                               `TimeBought` DATETIME NOT NULL,
                                               `Name` VARCHAR(45) NOT NULL,
    `Purchase Price` DECIMAL(2) NOT NULL,
    `NumberOfStocks` INT NOT NULL,
    `investmentaccountIDStocks` INT NOT NULL,
    PRIMARY KEY (`StockID`),
    UNIQUE INDEX `idStocks_UNIQUE` (`StockID` ASC) VISIBLE,
    CONSTRAINT `InvestmentAccountID`
    FOREIGN KEY (`investmentaccountIDStocks`)
    REFERENCES `mydb`.`Investment Account` (`InvestmentAccountID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Stock Transaction`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Stock Transaction` (
                                                          `transactionID` INT NOT NULL,
                                                          `TransactionTime` DATETIME NOT NULL,
                                                          `Amount` DECIMAL(2) NOT NULL,
    `transactionType` VARCHAR(45) NOT NULL,
    `StockName` VARCHAR(45) NOT NULL,
    `StockID` INT NOT NULL,
    `investmentAccountIDStocksTx` INT NOT NULL,
    PRIMARY KEY (`transactionID`),
    UNIQUE INDEX `transactionID_UNIQUE` (`transactionID` ASC) VISIBLE,
    CONSTRAINT `stockID`
    FOREIGN KEY (`StockID`)
    REFERENCES `mydb`.`Stocks` (`StockID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `investmentAccountID`
    FOREIGN KEY (`investmentAccountIDStocksTx`)
    REFERENCES `mydb`.`Investment Account` (`InvestmentAccountID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ETF`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ETF` (
                                            `etfID` INT NOT NULL,
                                            `Name` VARCHAR(45) NOT NULL,
    `PurchasePrice` DECIMAL(2) NOT NULL,
    `InvestmentAccountIETF` INT NOT NULL,
    `TimeBought` DATETIME NOT NULL,
    `NumeberOfETF` INT NOT NULL,
    PRIMARY KEY (`etfID`),
    UNIQUE INDEX `etfID_UNIQUE` (`etfID` ASC) VISIBLE,
    CONSTRAINT `InvestmentAccountID`
    FOREIGN KEY (`InvestmentAccountIETF`)
    REFERENCES `mydb`.`Investment Account` (`InvestmentAccountID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Futures`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Futures` (
                                                `FuturesID` INT NOT NULL,
                                                `ExpiryDate` DATETIME NOT NULL,
                                                `Name` VARCHAR(45) NOT NULL,
    `TimeBought` DATETIME NOT NULL,
    `PurchasePrice` DECIMAL(2) NOT NULL,
    `NumberOfFutures` INT NOT NULL,
    `InvestmentAccountIDFutures` INT NOT NULL,
    PRIMARY KEY (`FuturesID`),
    UNIQUE INDEX `FuturesID_UNIQUE` (`FuturesID` ASC) VISIBLE,
    CONSTRAINT `InvestmentAccountID`
    FOREIGN KEY (`InvestmentAccountIDFutures`)
    REFERENCES `mydb`.`Investment Account` (`InvestmentAccountID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;