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
public class CartService {

    private Repository repository;
    private CartRepository cartRepository;

    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void setCartId(Long id) {
        cartRepository.setCartId(
                repository.findById(id).getId(),
                repository.findById(id).getTitle(),
                repository.findById(id).getPrice()
        );
    }

    public List<Cart> getCartAll() {
        return cartRepository.getCartAll();
    }
    public void delCartId(Long id) {
        cartRepository.delCartId(id);
    }
}
