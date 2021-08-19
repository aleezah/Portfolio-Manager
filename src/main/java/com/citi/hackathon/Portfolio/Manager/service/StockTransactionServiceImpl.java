package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.StockTransaction;
import com.citi.hackathon.Portfolio.Manager.repo.StockTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockTransactionServiceImpl implements StockTransactionService {

    @Autowired
    private StockTransactionRepository stockTxDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<StockTransaction> getAllStockTransaction(){
        return stockTxDAO.findAll();
    }

    @Override
    public Iterable<StockTransaction> getAllTransactionByStockID(Integer stock_ID){
        return stockTxDAO.findByStockidtx(stock_ID);
    }

}
