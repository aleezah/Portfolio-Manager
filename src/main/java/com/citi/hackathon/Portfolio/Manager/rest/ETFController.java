package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.ETF;
import com.citi.hackathon.Portfolio.Manager.service.ETFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/etf")
@CrossOrigin
public class ETFController {

    @Autowired
    private ETFService etfService;

    @GetMapping
    public Collection<ETF> getETF(){
        return etfService.getAllETFs();
    }
}
