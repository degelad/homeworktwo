/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.geekbrains.homeworktwo;

/**
 *
 * @author degelad
 */
public class Cart {

    private Long id;
    private String title;
    private int price;

    @Override
    public String toString() {
        return "product " + title + " price " + price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Cart(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Cart() {
    }

}
