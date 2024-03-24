package practice.comparableAndComparators;

import java.util.Comparator;

public class ProductComaparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getWeight()-o2.getWeight();
    }
}
