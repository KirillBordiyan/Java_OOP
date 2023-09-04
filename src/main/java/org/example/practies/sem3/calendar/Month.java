package org.example.practies.sem3.calendar;

import lombok.Getter;
import lombok.Setter;

@Getter

public enum Month {

    //либо чтобы не писать каждому value, можно описать пустой конструктор (по-умолчанию)
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6),
    JUL(6), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
    @Setter
    private int number;

    Month(int number) {
        this.number = number;
    }

}
