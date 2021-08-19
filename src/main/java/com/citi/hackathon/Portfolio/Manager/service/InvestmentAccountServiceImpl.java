package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.repo.InvestmentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class InvestmentAccountServiceImpl implements InvestmentAccountService {

    @Autowired
    private InvestmentAccountRepository investmentAccountRepository;

    @Override
    public Collection<InvestmentAccount> getAllInvestmentAccounts() {
        return investmentAccountRepository.findAll();
    }

    @Override
    public InvestmentAccount getInvestmentAccountById(int id) {
        InvestmentAccount investmentAccount = investmentAccountRepository.findByInvestmentaccountid(id);
        return investmentAccount;
    }

    @Override
    public InvestmentAccount addNewInvestmentAccount(InvestmentAccount investmentAccount){
        //I think we don't have to set the id

        return investmentAccountRepository.save(investmentAccount);
    };

    @Override
    public void deleteInvestmentAccount(int id){
        InvestmentAccount toBeDeleted = investmentAccountRepository.findById(id).get();
       investmentAccountRepository.delete(toBeDeleted);
    };

    @Override
    public void deleteInvestmentAccount(InvestmentAccount investmentAccount){
        investmentAccountRepository.delete(investmentAccount);
    };


}
