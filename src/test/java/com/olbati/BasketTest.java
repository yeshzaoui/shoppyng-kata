package com.olbati;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class BasketTest {

    private Basket basket = new Basket();

    @Test
    public void should_return_empty_list_when_no_product_added() {
        // Arrange

        // Act
        List<Product> products = basket.listProducts();

        // Assert
        assertThat(products).isEmpty();
    }

    @Test
    public void should_add_product() {
        // Arrange
        Product product = new Product(1L, BigDecimal.TEN);

        // Act
        basket.addProduct(product);

        // Assert
        List<Product> products = basket.listProducts();
        assertThat(products).containsExactly(product);
    }

    @Test
    public void should_delete_product() {
        // Arrange
        Product product = new Product(1L, BigDecimal.TEN);
        basket.addProduct(product);

        // Act
        basket.deleteProduct(1L);

        // Assert
        List<Product> products = basket.listProducts();
        assertThat(products).isEmpty();
    }


    @Test
    public void should_return_total_amount_of_added_products() {
        // Arrange
        Product product1 = new Product(1L, BigDecimal.TEN);
        basket.addProduct(product1);
        Product product2 = new Product(2L, BigDecimal.ONE);
        basket.addProduct(product2);
        Product product3 = new Product(3L, BigDecimal.TEN);
        basket.addProduct(product3);

        // Act
        BigDecimal result = basket.totalAmount();

        // Assert
        assertThat(result).isEqualByComparingTo(BigDecimal.valueOf(21L));
    }


}
