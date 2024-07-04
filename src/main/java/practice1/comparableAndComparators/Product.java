package practice1.comparableAndComparators;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product>{
    private int price;
    private int weight;

    public Product(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return this.price - o.getPrice();
    }
}
