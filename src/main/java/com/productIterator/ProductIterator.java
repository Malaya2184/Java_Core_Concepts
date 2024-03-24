package com.productIterator;

import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator {
    private List<Product> products;
    private int cursor;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return cursor < products.size();
    }

    @Override
    public Product next() {
        Product product = products.get(cursor);
        cursor++;
        return product;
    }
}
