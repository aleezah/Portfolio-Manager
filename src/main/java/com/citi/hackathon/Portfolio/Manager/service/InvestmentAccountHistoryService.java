package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface InvestmentAccountHistoryService {
    @Transactional(propagation = Propagation.REQUIRED)
    List<InvestmentAccountHistory> getHistoryById(Integer investmentAccountId);

    @Transactional(propagation = Propagation.REQUIRED)
    List<InvestmentAccountHistory> getHistoryByDate(Date entryDate);

    @Transactional(propagation = Propagation.REQUIRED)
    InvestmentAccountHistory insertInvestmentAccountHistory(InvestmentAccountHistory history);
}
