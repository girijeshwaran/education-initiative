package structural.decorator;
public class GiftWrap extends ProductDecorator {
    public GiftWrap(ProductFeature product) { super(product); }
    public void applyFeature() {
        product.applyFeature();
        System.out.println(" -> Added Gift Wrap");
    }
}