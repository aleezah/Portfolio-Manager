package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CashAccountRepository extends JpaRepository <CashAccount,Integer> {

    Collection<CashAccount> findByAccountType(String accountType);


}
