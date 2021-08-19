package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;

import com.citi.hackathon.Portfolio.Manager.repo.FuturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class FuturesServiceImpl implements FutureService {

    @Autowired
    private FuturesRepository futuresRepository;

    @Override
    public List<Futures> getAllFutures() {
        return futuresRepository.findAll();
    }

    @Override
    public Futures addNewFutures(Futures fut) {
        return futuresRepository.save(fut);
    }

    @Override
    public Futures updateFutures(Futures fut) {
        return futuresRepository.save(fut);
    }

    @Override
    public void deleteFutures(int id) {
        Futures toBeDeleted = futuresRepository.findById(id).get();
        deleteFutures(toBeDeleted);

    }

    @Override
    public void deleteFutures(Futures fut) {
        futuresRepository.delete(fut);
    }

}
