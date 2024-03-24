package practice.iterableAnditerators.customExample;

import java.util.Iterator;
import java.util.List;

public class ProductListIterator implements Iterator<Product> {
    private List<Product> productList;
    private int count =0;

    public ProductListIterator(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean hasNext() {
        return count < productList.size();
    }

    @Override
    public Product next() {
        Product product = productList.get(count);
        count++;
        return product;
    }
}
