package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;

import java.util.Collection;

public interface InvestmentAccountService {
    Collection<InvestmentAccount> getAllInvestmentAccounts();

    InvestmentAccount getInvestmentAccountById(int id);

    InvestmentAccount addNewInvestmentAccount(InvestmentAccount investmentAccount);

    void deleteInvestmentAccount(int id);

    void deleteInvestmentAccount(InvestmentAccount investmentAccount);
}
