package org.example.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    Long id;
    Store store;
    List<Food> foodList;
    Boolean isCanceled;
    LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public Boolean getCanceled() {
        return isCanceled;
    }

    public void setCanceled(Boolean canceled) {
        isCanceled = canceled;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCanceledAt() {
        return canceledAt;
    }

    public void setCanceledAt(LocalDateTime canceledAt) {
        this.canceledAt = canceledAt;
    }

    LocalDateTime canceledAt;

    public Order(Long id, Store store, List<Food> foodList) {
        this.id = id;
        this.store = store;
        this.foodList = foodList;
        this.createdAt = LocalDateTime.now();
        this.isCanceled = Boolean.FALSE;
    }

}
