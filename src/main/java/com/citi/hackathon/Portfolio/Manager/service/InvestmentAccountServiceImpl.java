package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.repo.InvestmentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InvestmentAccountServiceImpl implements InvestmentAccountService {

    @Autowired
    private InvestmentAccountRepository investmentAccountRepository;

    @Override
    public Collection<InvestmentAccount> getAllInvestmentAccounts() {
        return investmentAccountRepository.findAll();
    }
}
