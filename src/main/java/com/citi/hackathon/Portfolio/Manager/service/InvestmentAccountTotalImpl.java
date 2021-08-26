package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccountHistory;
import com.citi.hackathon.Portfolio.Manager.Entites.Stocks;
import com.citi.hackathon.Portfolio.Manager.repo.InvestmentAccountHistoryRepository;
import com.citi.hackathon.Portfolio.Manager.repo.InvestmentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Service
public class InvestmentAccountTotalImpl implements InvestmentAccountTotal {

    @Autowired
    private InvestmentAccountRepository investmentDAO;

    @Autowired
    private InvestmentAccountHistoryRepository historyDAO;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Double getTotalValue(Integer investmentAccountID){
        InvestmentAccount account = investmentDAO.findByInvestmentaccountid(investmentAccountID);
        Double totalValue_now = 0.00;
        Double totalInvestedValue = 0.00;
        List<Stocks> stocks = account.getListOfStocks();
        for (Stocks stock:stocks) {
            System.out.println(stock.getStockname());
            totalValue_now = totalValue_now + (priceOfStock(stock.getStockname())*stock.getNumberofstocks());
            System.out.println(totalValue_now);
            totalInvestedValue = totalInvestedValue + (stock.getNumberofstocks()*stock.getPurchaseprice());
            System.out.println(totalInvestedValue);
        }
        System.out.println(totalValue_now);
        System.out.println(totalInvestedValue);
        Calendar today = Calendar.getInstance();
        System.out.println(today.getTime());
        InvestmentAccountHistory history = new InvestmentAccountHistory(investmentAccountID,totalInvestedValue,totalValue_now,today.getTime());
        historyDAO.save(history);
        return totalValue_now;

    }

    public Double priceOfStock(String name){
        try {
            Stock stock = YahooFinance.get(name);

            BigDecimal price = stock.getQuote().getPrice();
            BigDecimal change = stock.getQuote().getChangeInPercent();
            BigDecimal peg = stock.getStats().getPeg();
            BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
            System.out.println(price);
            System.out.println(price.doubleValue());
            return price.doubleValue();
            //stock.print();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception occured");
            return 0.00;
        }
    }





}
