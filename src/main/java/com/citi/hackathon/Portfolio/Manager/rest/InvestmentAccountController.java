package com.citi.hackathon.Portfolio.Manager.rest;


import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import com.citi.hackathon.Portfolio.Manager.Entites.NetWorth;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountHistoryService;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountTotal;
import com.citi.hackathon.Portfolio.Manager.service.NetWorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private NetWorthService netWorthService;

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

    @RequestMapping(value = "/historicalValue/{id}", method = RequestMethod.GET)
    public List<InvestmentAccountHistory> getInvestmentAccountHistory(@PathVariable("id") Integer id){
        return investmentAccountHistoryService.getHistoryById(id) ;
    }

    @RequestMapping(value = "/historicalValue/{date}", method = RequestMethod.GET)
    public List<InvestmentAccountHistory> getInvestmentAccountHistoryByDate(@PathVariable("date") Date date){
        return investmentAccountHistoryService.getHistoryByDate(date) ;
    }


    @RequestMapping(value = "/networth", method = RequestMethod.GET)
    public Map<Date,Double> getNetWorth(){
        return netWorthService.getNetWorth() ;
    }


}
