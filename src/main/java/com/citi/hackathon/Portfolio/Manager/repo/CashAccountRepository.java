package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CashAccountRepository extends JpaRepository <CashAccount,Integer> {

    Collection<CashAccount> findByAccounttype(String accountType);

    Collection<CashAccount> findByCashaccname(String accountName);


}
