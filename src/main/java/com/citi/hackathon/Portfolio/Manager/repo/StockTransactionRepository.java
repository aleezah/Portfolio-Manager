package com.citi.hackathon.Portfolio.Manager.repo;


import com.citi.hackathon.Portfolio.Manager.Entites.StockTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockTransactionRepository extends JpaRepository<StockTransaction,Integer> {

    public List<StockTransaction> findByStockID(Integer Stock_ID);

}
