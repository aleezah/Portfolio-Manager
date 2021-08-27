package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccountHistory;
import com.citi.hackathon.Portfolio.Manager.repo.CashAccountHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CashAccountHistoryServiceImpl implements CashAccountHistoryService{

    @Autowired
    private CashAccountHistoryRepository cashAccountHistoryRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<CashAccountHistory> getHistoryById(Integer cashAccountId){
        return cashAccountHistoryRepository.findByCashaccountid(cashAccountId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<CashAccountHistory> getHistoryByDate(Date entryDate){
        return cashAccountHistoryRepository.findByEntrydate(entryDate);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CashAccountHistory addNewCashAccountHistory(CashAccountHistory history){
        return cashAccountHistoryRepository.save(history);
    }

    @Override
    public List<CashAccountHistory> getAllCashAccountHistory() {
        return cashAccountHistoryRepository.findAll();
    }
}
