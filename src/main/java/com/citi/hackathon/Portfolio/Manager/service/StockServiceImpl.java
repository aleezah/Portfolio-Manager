package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.Stocks;
import com.citi.hackathon.Portfolio.Manager.repo.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StocksRepository stockDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<Stocks> getAllStocks(){
        return stockDAO.findAll();
    }

    @Override
    public List<Stocks> getByName(String stock_Name){

        return stockDAO.findByName(stock_Name);

    }

}
