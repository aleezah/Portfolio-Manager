package com.citi.hackathon.Portfolio.Manager.Entites;

import java.io.Serializable;
import java.util.Date;

public class NetWorth implements Serializable {
    private Date entryDate;
    private Double value;

    // Getter and Setter

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    // Constructor


    public NetWorth(Date entryDate, Double value) {
        this.entryDate = entryDate;
        this.value = value;
    }
}
