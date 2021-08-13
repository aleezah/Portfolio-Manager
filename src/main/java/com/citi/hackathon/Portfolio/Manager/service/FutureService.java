package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;

import java.util.List;

public interface FutureService {
    List<Futures> getAllFutures();
    Futures addNewFuture(Futures fut);

    void deleteFuture(int id);

    void deleteFuture(Futures fut);

    Futures updateFuture(Futures fut);
}
