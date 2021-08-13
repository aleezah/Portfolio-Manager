package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.ETF;
import com.citi.hackathon.Portfolio.Manager.repo.ETFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ETFServiceImpl implements ETFService {

    @Autowired
    private ETFRepository etfRepository;

    @Override
    public Collection<ETF> getAllETFs() {
        return etfRepository.findAll();
    }
}

