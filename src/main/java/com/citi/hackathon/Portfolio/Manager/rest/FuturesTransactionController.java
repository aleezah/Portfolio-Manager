package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.FuturesTransaction;
import com.citi.hackathon.Portfolio.Manager.service.FuturesTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/futurestransaction")
public class FuturesTransactionController {

    @Autowired
    private FuturesTransactionService service;

    @RequestMapping("/all")
    public Iterable<FuturesTransaction> findAll(){
       return service.getAllFuturesTransaction();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Iterable<FuturesTransaction> findById(@PathVariable("id") Integer futuresId){
        return service.getAllFuturesTransactionById(futuresId);
    }

}
