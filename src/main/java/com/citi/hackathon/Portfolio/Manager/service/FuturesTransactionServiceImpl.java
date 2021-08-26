package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.FuturesTransaction;
import com.citi.hackathon.Portfolio.Manager.repo.FuturesTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FuturesTransactionServiceImpl implements FuturesTransactionService {

    @Autowired
    private FuturesTransactionRepository futuresTxDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<FuturesTransaction> getAllFuturesTransaction(){
        return futuresTxDAO.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<FuturesTransaction> getAllFuturesTransactionById(Integer futuresId){
        return futuresTxDAO.findByFuturesid(futuresId);
    }



}
