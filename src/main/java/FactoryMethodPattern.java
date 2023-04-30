import factory.ConcreteProductAFactory;
import factory.ConcreteProductBFactory;
import product.Product;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Product productA = new ConcreteProductAFactory().createOperation();
        Product productB = new ConcreteProductBFactory().createOperation();
    }
}
