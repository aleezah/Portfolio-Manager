package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import com.citi.hackathon.Portfolio.Manager.service.CashAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/Cash Account")
public class CashAccountController {

    @Autowired
    private CashAccountService accountService;

    @GetMapping
    public Collection<CashAccount> getCashAccount()
    {
        return accountService.getAllCashAccount();

    }

}
