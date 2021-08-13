package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FutureRepository extends JpaRepository<Futures, Integer> {

    Collection<Futures> findByID(Integer id);
}