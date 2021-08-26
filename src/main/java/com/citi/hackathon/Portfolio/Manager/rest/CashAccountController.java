package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import com.citi.hackathon.Portfolio.Manager.Entites.CashAccountHistory;
import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import com.citi.hackathon.Portfolio.Manager.service.CashAccountHistoryService;
import com.citi.hackathon.Portfolio.Manager.service.CashAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/CashAccount")
@CrossOrigin
public class CashAccountController {

    @Autowired
    private CashAccountService accountService;

    @Autowired
    CashAccountHistoryService historyService;

    @GetMapping
    public Collection<CashAccount> getCashAccount()
    {
        return accountService.getAllCashAccount();

    }

    @RequestMapping(value = "/historicalValueById/{id}", method = RequestMethod.GET)
    public List<CashAccountHistory> getCashAccountHistory(@PathVariable("id") Integer id){
        return historyService.getHistoryById(id) ;
    }

    @RequestMapping(value = "/historicalValueByDate/{date}", method = RequestMethod.GET)
    public List<CashAccountHistory> getCashAccountHistoryByDate(@PathVariable("date") String date) throws ParseException {
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return historyService.getHistoryByDate(date1) ;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCashAccount(@RequestBody CashAccount account) {
        accountService.addNewCashAccount(account);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCashAccount(@PathVariable("id") int id) {
        accountService.deleteCashAccount(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCashAccount(@RequestBody CashAccount account) {
        accountService.deleteCashAccount(account);
    }




}
