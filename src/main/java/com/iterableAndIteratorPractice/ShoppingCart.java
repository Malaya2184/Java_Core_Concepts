package com.iterableAndIteratorPractice;

import com.productIterator.ProductIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product>{
    private List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(String name){
        productList.add(new Product(name));
    }

    @NotNull
    @Override
    public Iterator<Product> iterator() {
        return new ProductListIterator(productList);
    }
}
