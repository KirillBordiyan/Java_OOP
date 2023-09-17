package org.example.practies.sem6.warehouse.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IndividualProduct extends Product{
    private int customizeTimeDays;
    public IndividualProduct(String naming, int price, int qty, CategoryProduct categoryProduct, int customizeTimeDays) {
        super(naming, price, qty, categoryProduct);
        this.customizeTimeDays = customizeTimeDays;
    }
}
