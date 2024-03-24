package com.iterableAndIteratorPractice;

import java.util.Iterator;
import java.util.List;

public class ProductListIterator implements Iterator<Product> {
    private List<Product> productList;
    private int counter =0;

    public ProductListIterator(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean hasNext() {
        return counter<productList.size();
    }

    @Override
    public Product next() {
        Product currentProduct = productList.get(counter);
        counter++;
        return currentProduct;
    }
}
