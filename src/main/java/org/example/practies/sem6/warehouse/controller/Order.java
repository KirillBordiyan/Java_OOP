package org.example.practies.sem6.warehouse.controller;

import lombok.Getter;
import lombok.Setter;
import org.example.practies.sem6.warehouse.model.Product;

import java.util.Scanner;

@Getter
@Setter
public class Order {
    private Product product;
    private int productQty;
    private Warehouse warehouse;

    public Order(Product product, int productQry, Warehouse warehouse){
        this.product = product;
        this.productQty = productQry;
        this.warehouse = warehouse;
    }

    public void orderProcess(Product product, int productQty){
        if(warehouse.productOperation(product, productQty)){
            System.out.println("операция с  " + product.getNaming() + " успешна");
        } else {
            System.out.println("анлак :(");
        }
    }



}
