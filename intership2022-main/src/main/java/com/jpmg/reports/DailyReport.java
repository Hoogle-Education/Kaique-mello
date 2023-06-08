package com.jpmg.reports;

public class DailyReport {
    private String code;
    private String name;
    private int id;
    private String ticker;
    private int quantity;
    private float price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DailyReport{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", ticker='" + ticker + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
