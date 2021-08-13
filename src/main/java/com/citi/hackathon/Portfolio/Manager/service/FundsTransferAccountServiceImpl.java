package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.FundsTransferAccount;
import com.citi.hackathon.Portfolio.Manager.repo.FundsTransferAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FundsTransferAccountServiceImpl implements FundsTransferAccountService{

    @Autowired
    private FundsTransferAccountRepo transfersRepository;

    @Override
    public Collection<FundsTransferAccount> getAllTransfers() {
        return transfersRepository.findAll();
    }

    @Override
    public FundsTransferAccount addNewTransfer(FundsTransferAccount transfer) {
        return transfersRepository.save(transfer);
    }

    @Override
    public FundsTransferAccount updateTransfer(FundsTransferAccount transfer) {
        return transfersRepository.save(transfer);
    }


}
