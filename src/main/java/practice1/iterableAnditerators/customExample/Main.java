package practice1.iterableAnditerators.customExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart(productList);
        shoppingCart.addProduct(new Product("apple"));
        shoppingCart.addProduct(new Product("mango"));
        shoppingCart.addProduct(new Product("banana"));
        Iterator productListIterator = shoppingCart.iterator();
        while(productListIterator.hasNext()){
            System.out.println(productListIterator.next());
        }


    }
}
