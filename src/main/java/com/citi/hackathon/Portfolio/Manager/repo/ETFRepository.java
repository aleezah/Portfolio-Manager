package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.ETF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ETFRepository extends JpaRepository<ETF, Integer> {

    public List<ETF> findByEtfid(Integer etf_ID);

    public List<ETF> findByEtfname(String etfName);

}
