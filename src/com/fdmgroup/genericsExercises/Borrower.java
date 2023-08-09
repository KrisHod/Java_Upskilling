package com.fdmgroup.genericsExercises;

public class Borrower implements CatalogItem {
    private int id;

    public Borrower(int id) {
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
