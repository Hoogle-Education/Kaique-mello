package com.jpmg.reports;

import java.util.Date;

public class Trade {
    private int orderId;
    private Date timeStamp;
    private int quantity;
    private float price;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
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
        return "Trade{" +
                "OrderId=" + orderId +
                ", TimeStamp=" + timeStamp +
                ", Quantity=" + quantity +
                ", Price=" + price +
                '}';
    }
}
