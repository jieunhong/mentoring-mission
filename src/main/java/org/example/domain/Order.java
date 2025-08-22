package org.example.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    Long id;
    Store store;
    List<Food> foodList;
    Boolean isCanceled;
    LocalDateTime createdAt;
    LocalDateTime canceledAt;

    public Order(Long id, Store store, List<Food> foodList) {
        this.id = id;
        this.store = store;
        this.foodList = foodList;
        this.createdAt = LocalDateTime.now();
        this.isCanceled = Boolean.FALSE;
    }

}
