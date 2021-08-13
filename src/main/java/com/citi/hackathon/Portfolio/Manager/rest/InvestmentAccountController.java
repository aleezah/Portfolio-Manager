package com.citi.hackathon.Portfolio.Manager.rest;


import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/investmentAccount")
public class InvestmentAccountController {

    @Autowired
    private InvestmentAccountService investmentAccountService;

    @GetMapping
    public Collection<InvestmentAccount> getInvestmentAccounts() {
        return investmentAccountService.getAllInvestmentAccounts();
    }
}
