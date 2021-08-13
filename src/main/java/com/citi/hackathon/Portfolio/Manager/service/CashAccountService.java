package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;

import java.util.Collection;

public interface CashAccountService {
    Collection<CashAccount> getAllCashAccount();
    CashAccount addNewCashAccount (CashAccount account);
    CashAccount updateCashAccount(CashAccount account);
    void deleteCashAccount(int id);

    void deleteCashAccount(CashAccount account);
}
