package practice.iterableAnditerators.customExample;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product>{
    private List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }

    @NotNull
    @Override
    public Iterator<Product> iterator() {
        return new ProductListIterator(productList);
    }
}
