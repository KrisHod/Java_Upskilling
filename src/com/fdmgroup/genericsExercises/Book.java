package com.fdmgroup.genericsExercises;

public class Book implements CatalogItem {
    private int id;

    public Book(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
