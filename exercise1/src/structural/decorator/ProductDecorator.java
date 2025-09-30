package structural.decorator;
public abstract class ProductDecorator implements ProductFeature {
    protected ProductFeature product;
    public ProductDecorator(ProductFeature product) { this.product = product; }
}