package org.example.practies.sem6.warehouse.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Product implements ProductOption{
    //для соблюдения ISP можно сделать какой-то класс еды и в него имплементировать интерфейс ProductOption
    private String naming;
    private int price;
    private int qty;
    private CategoryProduct categoryProduct;

    @Override
    public void decreaseQuantity(int amount){
        this.qty -= amount;
    }
    @Override
    public void increaseQuantity(int amount){
        this.qty += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(naming, product.naming) && categoryProduct == product.categoryProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(naming, price, qty, categoryProduct);
    }
}
