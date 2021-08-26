package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import com.citi.hackathon.Portfolio.Manager.repo.InvestmentAccountHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Access;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

@Service
public class InvestmentAccountHistoryServiceImpl implements InvestmentAccountHistoryService {

    @Autowired
    private InvestmentAccountHistoryRepository investmentAccountHistoryRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<InvestmentAccountHistory> getHistoryById(Integer investmentAccountId){
        return investmentAccountHistoryRepository.findByInvestmentaccountid(investmentAccountId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<InvestmentAccountHistory> getHistoryByDate(Date entryDate){
        return investmentAccountHistoryRepository.findByEntrydate(entryDate);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public InvestmentAccountHistory insertInvestmentAccountHistory(InvestmentAccountHistory history){
        return investmentAccountHistoryRepository.save(history);
    }
}
