package com.jpmg.reports;

public class Orders {

    private int id;
    private String ticker;
    private String trader;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "Id=" + id +
                ", Ticker='" + ticker + '\'' +
                ", Trader='" + trader + '\'' +
                '}';
    }
}
