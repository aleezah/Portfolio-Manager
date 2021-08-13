package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.repo.FutureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class FuturesServiceImpl implements FutureService {

    @Autowired
    private FutureRepository futureRepository;

    @Override
    public List<Future> getAllFutures() {
        return futureRepository.findAll();
    }
}
