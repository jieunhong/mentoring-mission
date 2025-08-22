package org.example.domain;

public class Food {

    Long id;
    String title;
    String description;
    Long price;

    public Food(Long id, String title, String description, Long price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
