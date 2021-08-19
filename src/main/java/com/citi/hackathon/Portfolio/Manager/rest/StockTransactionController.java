package com.citi.hackathon.Portfolio.Manager.rest;


import com.citi.hackathon.Portfolio.Manager.Entites.StockTransaction;
import com.citi.hackathon.Portfolio.Manager.Entites.Stocks;
import com.citi.hackathon.Portfolio.Manager.service.StockService;
import com.citi.hackathon.Portfolio.Manager.service.StockTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stocktransaction")
@CrossOrigin
public class StockTransactionController {

    @Autowired
    private StockTransactionService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<StockTransaction> findAll(){
        return service.getAllStockTransaction();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Iterable<StockTransaction> findByName(@PathVariable("id") Integer stock_ID){
        return service.getAllTransactionByStockID(stock_ID);
    }
}
