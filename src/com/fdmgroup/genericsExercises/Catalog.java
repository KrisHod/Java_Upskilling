package com.fdmgroup.genericsExercises;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends CatalogItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T findItem(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}


