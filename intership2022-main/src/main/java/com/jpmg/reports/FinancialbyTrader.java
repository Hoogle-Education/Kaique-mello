package com.jpmg.reports;

import java.util.List;

public class FinancialbyTrader {

    private String traderCode;
    private float total;

    public String getTraderCode() {
        return traderCode;
    }

    public void setTraderCode(String traderCode) {
        this.traderCode = traderCode;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "FinancialbyTrader{" +
                "TraderCode='" + traderCode + '\'' +
                ", Total=" + total +
                '}';
    }
}
