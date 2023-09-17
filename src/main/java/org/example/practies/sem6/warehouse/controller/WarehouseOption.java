package org.example.practies.sem6.warehouse.controller;

import org.example.practies.sem6.warehouse.model.Product;

public interface WarehouseOption {
    public void addProduct(Product product);
    public void removeProduct(Product product);

}
