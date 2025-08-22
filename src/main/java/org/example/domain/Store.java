package org.example.domain;

import java.util.List;

public class Store {

    String code;
    String name;
    List<Food> foodList;

    public Store(String code, String name, List<Food> foodList) {
        this.code = code;
        this.name = name;
        this.foodList = foodList;
    }

}
