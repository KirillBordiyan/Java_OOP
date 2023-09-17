package org.example.practies.sem6.warehouse.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private String naming;
    private int price;
    private int qty;
    private CategoryProduct categoryProduct;

    public void decreaseQuantity(int amount){
        this.qty -= amount;
    }

    public void increaseQuantity(int amount){
        this.qty += amount;
    }

}
