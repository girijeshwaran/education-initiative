package structural.decorator;
public class ExtendedWarranty extends ProductDecorator {
    public ExtendedWarranty(ProductFeature product) { super(product); }
    public void applyFeature() {
        product.applyFeature();
        System.out.println(" -> Added Extended Warranty");
    }
}