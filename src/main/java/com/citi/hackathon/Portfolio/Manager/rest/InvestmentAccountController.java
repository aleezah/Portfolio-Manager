package com.citi.hackathon.Portfolio.Manager.rest;


import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.Entites.Stocks;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("/investmentAccount")
public class InvestmentAccountController {

    @Autowired
    private InvestmentAccountService investmentAccountService;

    @GetMapping
    public Collection<InvestmentAccount> getInvestmentAccounts() {
        return investmentAccountService.getAllInvestmentAccounts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public InvestmentAccount getInvestmentAccountById(@PathVariable("id") Integer id){
        return investmentAccountService.getInvestmentAccountById(id);
    }


}
