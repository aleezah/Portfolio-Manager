package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.EtfTransaction;
import com.citi.hackathon.Portfolio.Manager.service.EtfTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/etftransaction")
public class EtfTransactionController {

    @Autowired
    private EtfTransactionService service;

    @RequestMapping("/all")
    public Iterable<EtfTransaction> findAllEtfTransaction(){
        return service.getAllEtfTransaction();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Iterable<EtfTransaction> findEtfTransactionById(@PathVariable("id") Integer etfId){
        return service.getAllEtfTransactionById(etfId);
    }

}
