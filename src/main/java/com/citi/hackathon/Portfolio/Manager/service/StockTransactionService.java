package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.StockTransaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface StockTransactionService {
    @Transactional(propagation = Propagation.REQUIRED)
    Iterable<StockTransaction> getAllStockTransaction();

    Iterable<StockTransaction> getAllTransactionByStockID(Integer stock_ID);
}
