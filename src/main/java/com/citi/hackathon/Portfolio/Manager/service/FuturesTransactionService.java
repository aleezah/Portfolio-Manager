package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.FuturesTransaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface FuturesTransactionService {
    @Transactional(propagation = Propagation.REQUIRED)
    Iterable<FuturesTransaction> getAllFuturesTransaction();

    @Transactional(propagation = Propagation.REQUIRED)
    Iterable<FuturesTransaction> getAllFuturesTransactionById(Integer futuresId);
}
