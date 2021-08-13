package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.Stocks;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StockService {
    @Transactional(propagation = Propagation.REQUIRED)
    Iterable<Stocks> getAllStocks();

    List<Stocks> getByName(String stock_Name);
}
