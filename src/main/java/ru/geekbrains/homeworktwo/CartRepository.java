/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.geekbrains.homeworktwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author degelad
 */
@Component(value = "cartRepository")
@Scope("prototype")
public class CartRepository {

    private List<Cart> cart;

    public List<Cart> getCartAll() {
        return Collections.unmodifiableList(cart);
    }

    @PostConstruct
    public void init() {
        cart = new ArrayList<>();
    }

    public void setCartId(Long id, String title, int price) {
        cart.add(new Cart(id, title, price));
    }

    public void delCartId(Long id) {
        Iterator<Cart> cartIterator = cart.iterator();
        while (cartIterator.hasNext()) {
            Cart nextCart = cartIterator.next();
            if (nextCart.getId().equals(id)) {
                cartIterator.remove();
            }
        }
    }
}
