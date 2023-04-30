package factory;

import product.ConcreteProductA;
import product.Product;

public class ConcreteProductBFactory implements ProductFactory {

    private ConcreteProductBFactory() {}

    private static class InstanceHolder {
        private static final ConcreteProductBFactory INSTANCE = new ConcreteProductBFactory();
    }

    public static ConcreteProductBFactory getInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA(1,"productA",10000);
    }
}
