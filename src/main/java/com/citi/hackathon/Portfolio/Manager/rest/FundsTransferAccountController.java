package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import com.citi.hackathon.Portfolio.Manager.Entites.FundsTransferAccount;
import com.citi.hackathon.Portfolio.Manager.service.CashAccountService;
import com.citi.hackathon.Portfolio.Manager.service.FundsTransferAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/Funds Transfer Account")
public class FundsTransferAccountController {

    @Autowired
    private FundsTransferAccountService transferService;

    @GetMapping
    public Collection<FundsTransferAccount> getFundsTransferAccount()
    {
        return transferService.getAllTransfers();

    }

    @RequestMapping(method = RequestMethod.POST)
    public void addFundsTransferAccount(@RequestBody FundsTransferAccount trans) {
        transferService.addNewTransfer(trans);
    }

}
