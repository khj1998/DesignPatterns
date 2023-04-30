import factory.ConcreteProductAFactory;
import factory.ConcreteProductBFactory;
import product.Product;

public class FactoryMethodPattern {
    public static void main(String[] args) {

        ConcreteProductAFactory concreteProductAFactory = ConcreteProductAFactory.getInstance();
        Product productA = concreteProductAFactory.createOperation();
        ConcreteProductBFactory concreteProductBFactory = ConcreteProductBFactory.getInstance();
        Product productB = concreteProductBFactory.createOperation();
    }
}
