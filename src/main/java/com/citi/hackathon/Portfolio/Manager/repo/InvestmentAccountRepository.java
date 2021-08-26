package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;
import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface InvestmentAccountRepository extends JpaRepository<InvestmentAccount, Integer> {

    public InvestmentAccount findByInvestmentaccountid(Integer id);

    public List<InvestmentAccount> findByInvestmentaccname(String investAccountName);

}
