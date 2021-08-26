package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.EtfTransaction;
import com.citi.hackathon.Portfolio.Manager.repo.EtfTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EtfTransactionServiceImpl implements EtfTransactionService {

    @Autowired
    private EtfTransactionRepository etfTxDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<EtfTransaction> getAllEtfTransaction(){
        return etfTxDAO.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<EtfTransaction> getAllEtfTransactionById(Integer etfId){
        return etfTxDAO.findByEtfid(etfId);
    }

}
