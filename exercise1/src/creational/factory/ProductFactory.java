package creational.factory;
public class ProductFactory {
    public static ProductFactoryType createProduct(String type) {
        switch (type.toLowerCase()) {
            case "electronics": return new Electronics();
            case "clothing": return new Clothing();
            default: throw new IllegalArgumentException("Unknown product type");
        }
    }
}