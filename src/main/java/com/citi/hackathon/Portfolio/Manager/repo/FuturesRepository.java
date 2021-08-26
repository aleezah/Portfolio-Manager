package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;

@Repository
public interface FuturesRepository extends JpaRepository<Futures, Integer> {


    public List<Futures> findByFuturesname(String futuresname);

}