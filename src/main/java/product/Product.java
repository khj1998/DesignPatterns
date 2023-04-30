package product;

public class Product {
    protected Integer productId;
    protected String name;
    protected Integer price;

    @Override
    public String toString() {
        return String.format("Create!! Product Id : %d,name : %s, price : %d\n", productId, name, price);
    }

    public String getName() {
        return this.name;
    }
}
