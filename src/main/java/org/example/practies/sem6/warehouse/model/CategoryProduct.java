package org.example.practies.sem6.warehouse.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum CategoryProduct {

    HOUSE("для дома"), GARDEN("для сада"), STREET("для улицы"), BATH("ванна");
    private String category;

    CategoryProduct(String  category) {
        this.category = category;
    }
}
