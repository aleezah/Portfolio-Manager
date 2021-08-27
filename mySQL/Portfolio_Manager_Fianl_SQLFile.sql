CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: namdevops7.conygre.com    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cashaccount`
--

DROP TABLE IF EXISTS `cashaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cashaccount` (
  `cashaccountid` int NOT NULL AUTO_INCREMENT,
  `funds` decimal(12,2) NOT NULL,
  `accounttype` varchar(45) NOT NULL,
  `cashaccname` varchar(255) DEFAULT 'Citi',
  PRIMARY KEY (`cashaccountid`),
  UNIQUE KEY `cash_account_id_UNIQUE` (`cashaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashaccount`
--

LOCK TABLES `cashaccount` WRITE;
/*!40000 ALTER TABLE `cashaccount` DISABLE KEYS */;
INSERT INTO `cashaccount` VALUES (1,150000.00,'Checking','Citi Saving'),(2,145986.00,'Saving','JP Morgan Saving');
/*!40000 ALTER TABLE `cashaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cashaccounthistory`
--

DROP TABLE IF EXISTS `cashaccounthistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cashaccounthistory` (
  `cashaccounthistoryid` int NOT NULL AUTO_INCREMENT,
  `entrydate` date NOT NULL,
  `totalvalue` decimal(15,2) NOT NULL,
  `cashaccountid` int NOT NULL,
  PRIMARY KEY (`cashaccounthistoryid`),
  KEY `cashaccountandhistory_idx` (`cashaccountid`),
  CONSTRAINT `cashaccountandhistory` FOREIGN KEY (`cashaccountid`) REFERENCES `cashaccount` (`cashaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashaccounthistory`
--

LOCK TABLES `cashaccounthistory` WRITE;
/*!40000 ALTER TABLE `cashaccounthistory` DISABLE KEYS */;
INSERT INTO `cashaccounthistory` VALUES (1,'2021-08-26',150000.00,1),(2,'2021-08-25',258946.00,1),(3,'2021-08-24',569785.00,1),(4,'2021-08-23',869570.00,1),(5,'2021-07-22',789654.00,1),(6,'2021-04-20',896754.00,1),(7,'2021-08-26',145986.00,2),(8,'2021-08-25',250000.00,2),(9,'2021-08-24',698754.25,2),(10,'2021-08-23',584297.68,2),(11,'2021-07-22',458967.25,2),(12,'2021-04-20',112369.36,2);
/*!40000 ALTER TABLE `cashaccounthistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etf`
--

DROP TABLE IF EXISTS `etf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etf` (
  `etfid` int NOT NULL AUTO_INCREMENT,
  `etfname` varchar(255) NOT NULL,
  `purchaseprice` decimal(12,2) NOT NULL,
  `investmentaccountidetf` int NOT NULL,
  `timebought` datetime NOT NULL,
  `numberofetf` int NOT NULL,
  PRIMARY KEY (`etfid`),
  UNIQUE KEY `etf_id_UNIQUE` (`etfid`),
  KEY `etfinvestacc_idx` (`investmentaccountidetf`),
  CONSTRAINT `etfinvestacc` FOREIGN KEY (`investmentaccountidetf`) REFERENCES `investmentaccount` (`investmentaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etf`
--

LOCK TABLES `etf` WRITE;
/*!40000 ALTER TABLE `etf` DISABLE KEYS */;
INSERT INTO `etf` VALUES (1,'VOO',244.32,1,'2019-01-31 10:59:59',500),(2,'BSPIX',316.39,2,'2019-01-31 10:59:59',500);
/*!40000 ALTER TABLE `etf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etftransaction`
--

DROP TABLE IF EXISTS `etftransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etftransaction` (
  `etftransactionid` int NOT NULL AUTO_INCREMENT,
  `eftname` varchar(45) NOT NULL,
  `etftransactiontype` varchar(45) NOT NULL,
  `etftransactiontime` datetime NOT NULL,
  `numberofetf` int NOT NULL,
  `etfid` int NOT NULL,
  `etfinvestmentacc` int NOT NULL,
  `etftransactionamount` decimal(12,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`etftransactionid`),
  KEY `etftransactioninvestacc_idx` (`etfinvestmentacc`),
  KEY `etftransactionetfid_idx` (`etfid`),
  CONSTRAINT `etftransactionetfid` FOREIGN KEY (`etfid`) REFERENCES `etf` (`etfid`),
  CONSTRAINT `etftransactioninvestacc` FOREIGN KEY (`etfinvestmentacc`) REFERENCES `investmentaccount` (`investmentaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etftransaction`
--

LOCK TABLES `etftransaction` WRITE;
/*!40000 ALTER TABLE `etftransaction` DISABLE KEYS */;
INSERT INTO `etftransaction` VALUES (1,'VOO','Buy','2019-01-31 10:59:59',500,1,1,122160.00),(2,'BSPIX','Buy','2019-01-31 10:59:59',500,2,2,158195.00);
/*!40000 ALTER TABLE `etftransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fundstransferaccount`
--

DROP TABLE IF EXISTS `fundstransferaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fundstransferaccount` (
  `fundstransferaccountid` int NOT NULL AUTO_INCREMENT,
  `funds` decimal(12,2) NOT NULL,
  `transfertype` varchar(45) NOT NULL,
  `investmentaccountidft` int NOT NULL,
  `cashaccountidft` int NOT NULL,
  PRIMARY KEY (`fundstransferaccountid`),
  UNIQUE KEY `funds_transfer_account_id_UNIQUE` (`fundstransferaccountid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fundstransferaccount`
--

LOCK TABLES `fundstransferaccount` WRITE;
/*!40000 ALTER TABLE `fundstransferaccount` DISABLE KEYS */;
/*!40000 ALTER TABLE `fundstransferaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `futures`
--

DROP TABLE IF EXISTS `futures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `futures` (
  `futuresid` int NOT NULL AUTO_INCREMENT,
  `expirydate` datetime NOT NULL,
  `futuresname` varchar(255) NOT NULL,
  `timebought` datetime NOT NULL,
  `purchaseprice` decimal(12,2) NOT NULL,
  `numberoffutures` int NOT NULL,
  `investmentaccountidf` int NOT NULL,
  PRIMARY KEY (`futuresid`),
  UNIQUE KEY `futures_id_UNIQUE` (`futuresid`),
  KEY `futuresinvestmentacc_idx` (`investmentaccountidf`),
  CONSTRAINT `futuresinvestmentacc` FOREIGN KEY (`investmentaccountidf`) REFERENCES `investmentaccount` (`investmentaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `futures`
--

LOCK TABLES `futures` WRITE;
/*!40000 ALTER TABLE `futures` DISABLE KEYS */;
INSERT INTO `futures` VALUES (1,'2022-12-31 23:59:59','Oil Futures','2020-12-31 23:59:59',85.36,10,1);
/*!40000 ALTER TABLE `futures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `futurestransaction`
--

DROP TABLE IF EXISTS `futurestransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `futurestransaction` (
  `futurestransactionid` int NOT NULL AUTO_INCREMENT,
  `futuresid` int NOT NULL,
  `futuresinvestmentaccid` int NOT NULL,
  `numberoffutures` int NOT NULL,
  `futurestransactiontime` datetime NOT NULL,
  `futurestransactiontype` varchar(45) NOT NULL,
  `futuresname` varchar(255) NOT NULL,
  `futurestransactionamount` decimal(12,2) NOT NULL,
  PRIMARY KEY (`futurestransactionid`),
  KEY `futurestransactioninvestmentacc_idx` (`futuresinvestmentaccid`),
  KEY `futurestransactionfuturesid_idx` (`futuresid`),
  CONSTRAINT `futurestransactionfuturesid` FOREIGN KEY (`futuresid`) REFERENCES `futures` (`futuresid`),
  CONSTRAINT `futurestransactioninvestmentacc` FOREIGN KEY (`futuresinvestmentaccid`) REFERENCES `investmentaccount` (`investmentaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `futurestransaction`
--

LOCK TABLES `futurestransaction` WRITE;
/*!40000 ALTER TABLE `futurestransaction` DISABLE KEYS */;
INSERT INTO `futurestransaction` VALUES (1,1,1,10,'2020-12-31 23:59:59','Buy','Oil Futures',853.60);
/*!40000 ALTER TABLE `futurestransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investmentaccount`
--

DROP TABLE IF EXISTS `investmentaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `investmentaccount` (
  `investmentaccountid` int NOT NULL AUTO_INCREMENT,
  `funds` decimal(12,2) NOT NULL,
  `investmentaccname` varchar(255) DEFAULT 'Citi Investment',
  PRIMARY KEY (`investmentaccountid`),
  UNIQUE KEY `Investment_account_id_UNIQUE` (`investmentaccountid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investmentaccount`
--

LOCK TABLES `investmentaccount` WRITE;
/*!40000 ALTER TABLE `investmentaccount` DISABLE KEYS */;
INSERT INTO `investmentaccount` VALUES (1,80000.00,'Citi Investment'),(2,89000.00,'Fidelity Investment');
/*!40000 ALTER TABLE `investmentaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investmentaccounthistory`
--

DROP TABLE IF EXISTS `investmentaccounthistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `investmentaccounthistory` (
  `investmentaccounthistoryid` int NOT NULL AUTO_INCREMENT,
  `entrydate` date NOT NULL,
  `investedvalue` decimal(15,2) NOT NULL,
  `currentvalue` decimal(15,2) NOT NULL,
  `investmentaccountid` int NOT NULL,
  PRIMARY KEY (`investmentaccounthistoryid`),
  KEY `investmentaccountandhistory_idx` (`investmentaccountid`),
  CONSTRAINT `investmentaccountandhistory` FOREIGN KEY (`investmentaccountid`) REFERENCES `investmentaccount` (`investmentaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investmentaccounthistory`
--

LOCK TABLES `investmentaccounthistory` WRITE;
/*!40000 ALTER TABLE `investmentaccounthistory` DISABLE KEYS */;
INSERT INTO `investmentaccounthistory` VALUES (1,'2021-08-26',1473600.00,1764029.00,1),(2,'2021-08-25',1473600.00,1765000.00,1),(3,'2021-08-24',1473600.00,1756000.00,1),(4,'2021-08-23',1473600.00,1748000.00,1),(5,'2021-07-22',1473600.00,1689754.36,1),(6,'2021-04-20',1300000.00,1450000.00,1),(7,'2021-08-26',2569000.00,3569800.00,2),(8,'2021-08-25',2569000.00,3578945.00,2),(9,'2021-08-24',2569000.00,3598764.00,2),(10,'2021-08-23',2569000.00,3566666.00,2),(11,'2021-07-22',2569000.00,3599987.66,2),(12,'2021-04-20',2300000.00,3168975.00,2);
/*!40000 ALTER TABLE `investmentaccounthistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stocks`
--

DROP TABLE IF EXISTS `stocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stocks` (
  `stockid` int NOT NULL AUTO_INCREMENT,
  `timebought` datetime NOT NULL,
  `stockname` varchar(45) NOT NULL,
  `purchaseprice` decimal(12,2) NOT NULL,
  `numberofstocks` int NOT NULL,
  `investmentaccountids` int NOT NULL,
  PRIMARY KEY (`stockid`),
  UNIQUE KEY `stocks_id_UNIQUE` (`stockid`),
  KEY `stockinvestmentacc_idx` (`investmentaccountids`),
  CONSTRAINT `stockinvestmentacc` FOREIGN KEY (`investmentaccountids`) REFERENCES `investmentaccount` (`investmentaccountid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stocks`
--

LOCK TABLES `stocks` WRITE;
/*!40000 ALTER TABLE `stocks` DISABLE KEYS */;
INSERT INTO `stocks` VALUES (1,'2020-12-31 23:59:59','AAPL',121.36,10000,1),(2,'2020-12-03 23:59:59','GOOGL',2600.00,100,1),(3,'2020-12-01 23:59:59','AMZN',3322.00,100,2),(4,'2020-11-03 23:59:59','MSFT',202.33,10000,2);
/*!40000 ALTER TABLE `stocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stocktransaction`
--

DROP TABLE IF EXISTS `stocktransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stocktransaction` (
  `transactionid` int NOT NULL AUTO_INCREMENT,
  `transactiontime` datetime NOT NULL,
  `amount` decimal(12,2) NOT NULL,
  `transactiontype` varchar(45) NOT NULL,
  `stockname` varchar(45) NOT NULL,
  `stockidtx` int NOT NULL,
  `investmentaccountidtx` int NOT NULL,
  PRIMARY KEY (`transactionid`),
  UNIQUE KEY `transaction_id_UNIQUE` (`transactionid`),
  KEY `stock_id_tx` (`stockidtx`),
  KEY `investment_account_id_tx` (`investmentaccountidtx`),
  CONSTRAINT `stocktransactioninvestmentacc` FOREIGN KEY (`investmentaccountidtx`) REFERENCES `investmentaccount` (`investmentaccountid`),
  CONSTRAINT `stocktransactionrecord` FOREIGN KEY (`stockidtx`) REFERENCES `stocks` (`stockid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stocktransaction`
--

LOCK TABLES `stocktransaction` WRITE;
/*!40000 ALTER TABLE `stocktransaction` DISABLE KEYS */;
INSERT INTO `stocktransaction` VALUES (1,'2020-12-31 23:59:59',1213600.00,'Buy','AAPL',1,1),(2,'2020-12-03 23:59:59',260000.00,'Buy','GOOGL',2,1),(3,'2020-12-01 23:59:59',332200.00,'Buy','AMZN',3,2),(4,'2020-11-03 23:59:59',2023300.00,'Buy','MSFT',4,2);
/*!40000 ALTER TABLE `stocktransaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-27 19:30:19
