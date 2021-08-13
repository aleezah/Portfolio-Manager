package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import com.citi.hackathon.Portfolio.Manager.repo.CashAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CashAccountServiceImpl implements CashAccountService {

    @Autowired
    private CashAccountRepository cashAccountRepository;

    @Override
    public Collection <CashAccount> getAllCashAccount()
    {
     return cashAccountRepository.findAll();
    }

}
