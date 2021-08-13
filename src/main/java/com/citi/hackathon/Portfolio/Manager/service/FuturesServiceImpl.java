package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;
import com.citi.hackathon.Portfolio.Manager.repo.FutureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuturesServiceImpl implements FutureService {

    @Autowired
    private FutureRepository futureRepository;

    @Override
    public List<Futures> getAllFutures() {
        return futureRepository.findAll();
    }

    @Override
    public Futures addNewFuture(Futures fut) {
        return futureRepository.save(fut);
    }

    @Override
    public Futures updateFuture(Futures fut) {
        return futureRepository.save(fut);
    }

    @Override
    public void deleteFuture(int id) {
        Futures toBeDeleted = futureRepository.findById(id).get();
        deleteFuture(toBeDeleted);

    }

    @Override
    public void deleteFuture(Futures fut) {
        futureRepository.delete(fut);
    }

}
