package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface InvestmentAccountHistoryRepository extends JpaRepository<InvestmentAccountHistory,Integer> {
    public List<InvestmentAccountHistory> findByEntrydate(Date entryDate);
    public List<InvestmentAccountHistory> findByInvestmentaccountid(Integer investmentAccountId);
}
