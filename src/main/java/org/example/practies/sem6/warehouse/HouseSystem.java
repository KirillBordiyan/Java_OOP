package org.example.practies.sem6.warehouse;

import org.example.practies.sem6.warehouse.controller.Order;
import org.example.practies.sem6.warehouse.controller.Warehouse;
import org.example.practies.sem6.warehouse.model.*;

import java.util.Arrays;

public class HouseSystem {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(Arrays.asList(
                new Product("p1", 100, 40, CategoryProduct.HOUSE),
                new Product("p2", 20, 1000, CategoryProduct.HOUSE),
                new Product("p3", 10, 40, CategoryProduct.BATH),
                new Product("p4", 80, 1, CategoryProduct.BATH),
                new Product("p5", 17, 0, CategoryProduct.GARDEN),
                new Product("p6", 200, 145, CategoryProduct.STREET),
                new IndividualProduct("ip", 1000, 1, CategoryProduct.GARDEN, 4))
                );

        Order order = new Order(new Product("p1", 100, 41, CategoryProduct.HOUSE),
                510,
                warehouse);

        order.orderProcess(order.getProduct(), order.getProductQty());

        System.out.println();

        Order order1 = new Order(new IndividualProduct("ip", 1000, 1, CategoryProduct.GARDEN, 4),
                1,
                warehouse);
        order1.orderProcess(order1.getProduct(), order1.getProductQty());
    }


}

//    Создать систему управления складом(SOLID)
//        a)	Product должен хранит информацию о товаре, такую как название, количество, цена и тд.
//        (decreaseQuantity(int amount) , increaseQuantity(int amount))
//        b)	Warehouse должен управлять запасами товаров на складе, обеспечивает их хранение и выдачу.
//        (добавление/удаление продукта, увеличение/уменьшение количества продукта)
//        c)	Order должен отвечать за обработку заказов на товары со склада.
//        (processOrder(Product product, int amount)- обработка заказа)

