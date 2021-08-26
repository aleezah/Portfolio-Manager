package com.citi.hackathon.Portfolio.Manager.rest;


import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountHistoryService;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/investmentAccount")
public class InvestmentAccountController {

    @Autowired
    private InvestmentAccountService investmentAccountService;

    @Autowired
    private InvestmentAccountTotal investmentAccountTotalService;

    @Autowired
    private InvestmentAccountHistoryService investmentAccountHistoryService;

    @GetMapping
    public Collection<InvestmentAccount> getInvestmentAccounts() {
        return investmentAccountService.getAllInvestmentAccounts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public InvestmentAccount getInvestmentAccountById(@PathVariable("id") Integer id){
        return investmentAccountService.getInvestmentAccountById(id);
    }

    @RequestMapping(value = "/totalValue/{id}", method = RequestMethod.GET)
    public Double getInvestmentAccountTotal(@PathVariable("id") Integer id){
        return investmentAccountTotalService.getTotalValue(id) ;
    }

    @RequestMapping(value = "/historialValue/{id}", method = RequestMethod.GET)
    public List<InvestmentAccountHistory> getInvestmentAccountHistory(@PathVariable("id") Integer id){
        return investmentAccountHistoryService.getHistoryById(id) ;
    }


}
