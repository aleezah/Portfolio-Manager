package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.FundsTransferAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FundsTransferAccountRepo extends JpaRepository<FundsTransferAccount, Integer> {

    public Collection<FundsTransferAccount> findAllFundsTransfers(Integer id);
}