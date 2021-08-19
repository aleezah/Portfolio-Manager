package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.ETF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ETFRepository extends JpaRepository<ETF, Integer> {

    public List<ETF> findByEtfid(Integer etf_ID);

}
