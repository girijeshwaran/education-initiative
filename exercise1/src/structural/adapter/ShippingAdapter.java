package structural.adapter;
public class ShippingAdapter implements Shipping {
    private ExternalShippingService service;
    public ShippingAdapter(ExternalShippingService service) { this.service = service; }
    public void ship(String item) { service.sendPackage(item); }
}