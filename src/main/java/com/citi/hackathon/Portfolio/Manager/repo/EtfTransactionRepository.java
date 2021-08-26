package com.citi.hackathon.Portfolio.Manager.repo;

import com.citi.hackathon.Portfolio.Manager.Entites.EtfTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtfTransactionRepository extends JpaRepository<EtfTransaction,Integer> {

    public List<EtfTransaction> findByEtfid(Integer etfid);

}
