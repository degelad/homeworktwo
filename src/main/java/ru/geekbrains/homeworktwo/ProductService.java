/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.geekbrains.homeworktwo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author degelad
 */
@Service
public class ProductService {

    private Repository repository;

    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getTitleById(Long id) {
        return repository.findById(id).getTitle();
    }

    public List<Product> getAllProduct() {
        return repository.getTitleAllProducts();
    }
}
