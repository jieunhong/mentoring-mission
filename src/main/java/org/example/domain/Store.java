package org.example.domain;

import java.util.List;

public class Store {

    String code;
    String name;
    List<Food> foodList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public Store(String code, String name, List<Food> foodList) {
        this.code = code;
        this.name = name;
        this.foodList = foodList;
    }

}
