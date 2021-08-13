package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.FundsTransferAccount;

import java.util.Collection;

public interface FundsTransferAccountService {

    Collection<FundsTransferAccount> getAllTransfers();
    FundsTransferAccount addNewTransfer(FundsTransferAccount trans);
    FundsTransferAccount updateTransfer(FundsTransferAccount transfer);



}
