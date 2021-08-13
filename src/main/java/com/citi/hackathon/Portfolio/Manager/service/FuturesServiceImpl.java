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

    @Override
    public Future addNewFuture(Future fut) {
        return futureRepository.save(fut);
    }

    @Override
    public Future updateFuture(Future fut) {
        return futureRepository.save(fut);
    }

    @Override
    public void deleteFuture(int id) {
        Future toBeDeleted = futureRepository.findById(id).get();
        deleteFuture(toBeDeleted);

    }

    @Override
    public void deleteFuture(Future fut) {
        futureRepository.delete(fut);
    }

}
