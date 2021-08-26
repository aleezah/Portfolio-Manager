package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.EtfTransaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface EtfTransactionService {
    @Transactional(propagation = Propagation.REQUIRED)
    Iterable<EtfTransaction> getAllEtfTransaction();

    @Transactional(propagation = Propagation.REQUIRED)
    Iterable<EtfTransaction> getAllEtfTransactionById(Integer etfId);
}
