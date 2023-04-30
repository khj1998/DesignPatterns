package factory;

import product.ConcreteProductB;
import product.Product;

public class ConcreteProductAFactory implements ProductFactory {

    private  ConcreteProductAFactory() {}

    private static class InstanceHolder {
        private static final ConcreteProductAFactory INSTANCE = new ConcreteProductAFactory();
    }

    public static ConcreteProductAFactory getInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB(2,"productB",10000);
    }
}
