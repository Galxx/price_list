package com.gorokhov.common;

import java.io.Serializable;

public class ProductItem implements Serializable {

    private Long id;
    private String title;
    private String currency;
    private Double amount;
    private Double amountRUB;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmountRUB() {
        return amountRUB;
    }

    public void setAmountRUB(Double amountRUB) {
        this.amountRUB = amountRUB;
    }
}
