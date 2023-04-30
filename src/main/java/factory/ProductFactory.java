package factory;

import product.Product;

public interface ProductFactory {
    default Product createOperation() {
        Product product  = createProduct();
        System.out.println(product.toString());
        return product;
    }

    Product createProduct();
}
