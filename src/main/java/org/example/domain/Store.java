package org.example.domain;

import java.util.List;

public class Store {

    String code;
    String name;
    List<Food> menuList;

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

    public List<Food> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Food> menuList) {
        this.menuList = menuList;
    }

    public Store(String code, String name, List<Food> menuList) {
        this.code = code;
        this.name = name;
        this.menuList = menuList;
    }

}
