package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.concurrent.Future;

public interface FuturesRepository extends JpaRepository<Futures, Integer> {


}