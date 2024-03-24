package com.iterableAndIteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1,2,3,4,5);
//
//        Iterator numbersIterator = numbers.iterator();
//        while (numbersIterator.hasNext()){
//            System.out.println(numbersIterator.next());
//        }

        List<Product> productList = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart(productList);
        shoppingCart.addProduct("apple");
        shoppingCart.addProduct("banana");
        shoppingCart.addProduct("kiwi");

        Iterator productListIterator = shoppingCart.iterator();

        while (productListIterator.hasNext()){
            System.out.println(productListIterator.next());
        }


    }
}
