/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.geekbrains.homeworktwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.homeworktwo.config.AppConfig;

/**
 *
 * @author degelad
 */
public class Homeworktwo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        CartService cartService = context.getBean(CartService.class);
        
        System.out.println("Вывод одного продукта из прайса по id = 5 " +"\n" + productService.getTitleById(5L));
        
        System.out.println("Вывод всего прайса" + "\n" + productService.getAllProduct());
        
        cartService.setCartId(2L);
        System.out.println("Кладем в корзину продукт с id = 2 и выводим содержимое корзины" + "\n" + cartService.getCartAll());
        
        cartService.setCartId(5L);
        System.out.println("Кладем в корзину продукт с id = 5 и выводим содержимое корзины" + "\n" + cartService.getCartAll());
        
        cartService.delCartId(5L);
        System.out.println("Удаляем из корзины продукт где id = 5 и выводим содержимое корзины" + "\n" + cartService.getCartAll());
    }
}
