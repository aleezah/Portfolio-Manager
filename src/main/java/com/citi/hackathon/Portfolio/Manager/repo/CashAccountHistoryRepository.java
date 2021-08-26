package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CashAccountHistoryRepository extends JpaRepository<CashAccountHistory,Integer> {

    public List<CashAccountHistory> findByEntrydate(Date entryDate);
    public List<CashAccountHistory> findByCashaccountid(Integer cashAccountId);


}
