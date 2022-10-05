/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.geekbrains.homeworktwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author degelad
 */
@Component(value = "productRepository")
public class Repository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Bread", 50),
                new Product(2L, "Milk", 60),
                new Product(3L, "Orange", 70),
                new Product(4L, "Lime", 80),
                new Product(5L, "Kokos", 90)
        ));
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
    public List<Product> findByIdList(Long id) {
        return (List<Product>) products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Product> getTitleAllProducts() {
        return Collections.unmodifiableList(products);
    }
}
