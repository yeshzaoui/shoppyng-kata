package com.olbati;

import java.math.BigDecimal;

public class Product {

    private long id;
    private BigDecimal price;

    public Product(long id, BigDecimal price) {
        this.id = id;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
