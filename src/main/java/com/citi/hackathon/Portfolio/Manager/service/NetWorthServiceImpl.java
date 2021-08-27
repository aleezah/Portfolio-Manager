package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccountHistory;
import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import com.citi.hackathon.Portfolio.Manager.Entites.NetWorth;
import com.citi.hackathon.Portfolio.Manager.repo.CashAccountHistoryRepository;
import com.citi.hackathon.Portfolio.Manager.repo.InvestmentAccountHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class NetWorthServiceImpl implements NetWorthService {

    @Autowired
    private InvestmentAccountHistoryRepository investDAO;

    @Autowired
    private CashAccountHistoryRepository cashDAO;

    @Override
    public List<NetWorth> getNetWorth(){
        List<InvestmentAccountHistory> investHistory = investDAO.findAll();
        List<CashAccountHistory> cashHistory = cashDAO.findAll();
        List<NetWorth> netWorthHistory = new ArrayList<NetWorth>();
        List<NetWorth> netWorthHistory_final = new ArrayList<NetWorth>();


        for (InvestmentAccountHistory history: investHistory) {
             netWorthHistory.add(new NetWorth(history.getEntrydate(),history.getCurrentvalue()));

        }
        for (CashAccountHistory history:cashHistory) {
            netWorthHistory.add(new NetWorth(history.getEntrydate(),history.getTotalvalue()));
        }

        Map<Date,Double> net_worth = netWorthHistory.stream().collect(Collectors.groupingBy(NetWorth::getEntryDate,Collectors.summingDouble(NetWorth::getValue)));

        Map<Date,Double> result = net_worth.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        for (Map.Entry<Date,Double> history : result.entrySet()) {
            netWorthHistory_final.add(new NetWorth(history.getKey(),history.getValue()));

        }

        return netWorthHistory_final;
    }

}
