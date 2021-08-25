package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.Stocks;
import com.citi.hackathon.Portfolio.Manager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Stocks> findAll(){
        return service.getAllStocks();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Iterable<Stocks> findByName(@PathVariable("name") String name){
        return service.getByName(name);
    }

}
