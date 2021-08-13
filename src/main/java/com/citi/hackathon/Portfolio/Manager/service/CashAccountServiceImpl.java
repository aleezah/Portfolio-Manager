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

    @Override
    public CashAccount addNewCashAccount(CashAccount account) {
        return cashAccountRepository.save(account);
    }
    @Override
    public CashAccount updateCashAccount(CashAccount account) {
        return cashAccountRepository.save(account);
    }

    @Override
    public void deleteCashAccount(int id) {
        CashAccount toBeDeleted = cashAccountRepository.findById(id).get();
        deleteCashAccount(toBeDeleted);

    }

    @Override
    public void deleteCashAccount(CashAccount account) {
        cashAccountRepository.delete(account);
    }
}

