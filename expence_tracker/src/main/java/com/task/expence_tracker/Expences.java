package com.task.expence_tracker;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expences_tracker")
public class Expences {

    @Id
    private String expName;
    private double expAmt;
    private Date expDate;
    private String expType;
    public Expences() {
    }
    public Expences(String expName, double expAmt, Date expDate, String expType) {
        this.expName = expName;
        this.expAmt = expAmt;
        this.expDate = expDate;
        this.expType = expType;
    }
    public String getExpName() {
        return expName;
    }
    public void setExpName(String expName) {
        this.expName = expName;
    }
    public double getExpAmt() {
        return expAmt;
    }
    public void setExpAmt(double expAmt) {
        this.expAmt = expAmt;
    }
    public Date getExpDate() {
        return expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    public String getExpType() {
        return expType;
    }
    public void setExpType(String expType) {
        this.expType = expType;
    }
    
}
