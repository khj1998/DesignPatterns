package factory;

import product.ConcreteProductB;
import product.Product;

public class ConcreteProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB(2,"productB",10000);
    }
}
