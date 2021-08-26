package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.FuturesTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuturesTransactionRepository extends JpaRepository<FuturesTransaction,Integer> {
    public List<FuturesTransaction> findByFuturesid(Integer futuresid);
}
