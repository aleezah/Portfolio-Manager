package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import com.citi.hackathon.Portfolio.Manager.service.CashAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/Cash Account")
@CrossOrigin
public class CashAccountController {

    @Autowired
    private CashAccountService accountService;

    @GetMapping
    public Collection<CashAccount> getCashAccount()
    {
        return accountService.getAllCashAccount();

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
