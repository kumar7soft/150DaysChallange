package org.java;


import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Item {
    int id;
    String name;
    String category;
    int quantity;

    Item(int id, String name, String category, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }
}
class ItemDTO{

    public List<Item> getItems() {
        List<Item> items = Arrays.asList(
                new Item(1, "Laptop", "Electronics", 5),
                new Item(2, "Smartphone", "Electronics", 10),
                new Item(3, "Tablet", "Electronics", 7),
                new Item(4, "Headphones", "Accessories", 15),
                new Item(5, "Charger", "Accessories", 25),
                new Item(6, "Notebook", "Stationery", 50),
                new Item(7, "Pen", "Stationery", 100),
                new Item(8, "Marker", "Stationery", 30),
                new Item(9, "Keyboard", "Electronics", 8),
                new Item(10, "Mouse", "Electronics", 12)
        );
        return items;
    }

}
