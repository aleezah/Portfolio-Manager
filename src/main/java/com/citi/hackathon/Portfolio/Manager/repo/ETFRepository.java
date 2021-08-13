package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.ETF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ETFRepository extends JpaRepository<ETF, Integer> {

    Collection<ETF> findByID(Integer id);
}
