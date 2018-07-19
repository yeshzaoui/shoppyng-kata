package com.olbati;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> products = new ArrayList<>();

    public List<Product> listProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(long productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public BigDecimal totalAmount() {
        return products.stream()
                .map(product -> product.getPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
