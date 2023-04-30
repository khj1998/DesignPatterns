package factory;

import product.ConcreteProductA;
import product.Product;

public class ConcreteProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA(1,"productA",10000);
    }
}
