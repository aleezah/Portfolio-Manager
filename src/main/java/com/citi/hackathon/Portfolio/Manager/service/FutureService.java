package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;

import java.util.List;


public interface FutureService {
    List<Futures> getAllFutures();
    Futures addNewFutures(Futures fut);

    void deleteFutures(int id);

    void deleteFutures(Futures fut);

    Futures updateFutures(Futures fut);
}
