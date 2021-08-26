package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccountHistory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface CashAccountHistoryService {
    @Transactional(propagation = Propagation.REQUIRED)
    List<CashAccountHistory> getHistoryById(Integer cashAccountId);

    @Transactional(propagation = Propagation.REQUIRED)
    List<CashAccountHistory> getHistoryByDate(Date entryDate);

    @Transactional(propagation = Propagation.REQUIRED)
    CashAccountHistory addNewCashAccountHistory(CashAccountHistory history);
}
