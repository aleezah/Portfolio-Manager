package com.citi.hackathon.Portfolio.Manager.service;

import com.citi.hackathon.Portfolio.Manager.Entites.NetWorth;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface NetWorthService {
    public Map<Date,Double> getNetWorth();
}
