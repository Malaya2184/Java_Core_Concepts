package com.productIterator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store implements Iterable<Product> {
    private List<Product> products = new ArrayList<>();

    @NotNull
    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(products);
    }

    public void add(String name){
        products.add(new Product((name)));
    }
}
