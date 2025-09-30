package structural.adapter;
public class ExternalShippingService {
    public void sendPackage(String item) {
        System.out.println("Shipping " + item + " via External Service");
    }
}