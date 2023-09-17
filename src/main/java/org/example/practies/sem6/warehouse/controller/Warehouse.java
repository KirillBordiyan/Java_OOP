package org.example.practies.sem6.warehouse.controller;

import lombok.Getter;
import lombok.Setter;
import org.example.practies.sem6.warehouse.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Warehouse implements WarehouseOption{

    private List<Product> productList = new ArrayList<>();

    public Warehouse(List<Product> productList){
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product) {
        if(!productList.contains(product)){
            productList.add(product);
        }
    }

    @Override
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public boolean productOperation(Product product, int productQry) {
        System.out.println("buy - 1 /return back - 2 ?");
        Scanner scanner = new Scanner(System.in);
        String process = scanner.nextLine();

        switch (process) {
            case "1" -> {
                for (Product currentProduct : productList) {
                    if (currentProduct.getNaming().equals(product.getNaming())) {
                        if (currentProduct.getQty() >= productQry) {
                            currentProduct.decreaseQuantity(productQry);
                            System.out.println("товар " + product.getNaming()
                                    + "\nиз категории " + product.getCategoryProduct().getCategory()
                            + " куплен");
                            return true;
                        } else {
                            System.out.println("хочешь больше, чем есть");
                            return false;
                        }
                    }
                }
            }
            case "2" -> {
                for (Product currentProduct : productList) {
                    if (currentProduct.equals(product)) {
                        currentProduct.increaseQuantity(productQry);
                        System.out.println("возврат оформлен");
                        return true;
                    } else {
                        System.out.println("warehouse has no that product");
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
