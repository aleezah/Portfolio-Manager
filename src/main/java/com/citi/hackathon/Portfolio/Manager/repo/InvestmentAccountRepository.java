package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InvestmentAccountRepository extends JpaRepository<InvestmentAccount, Integer> {

    Collection<InvestmentAccount> findByID(Integer id);
}
