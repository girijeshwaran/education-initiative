import behavioral.observer.*;
import behavioral.strategy.*;
import creational.singleton.*;
import creational.factory.*;
import structural.decorator.*;
import structural.adapter.*;
public class Main {
    public static void main(String[] args) {
        // Observer
        Product phone = new Product("iPhone 15", false);
        Customer c1 = new Customer("Alice");
        phone.addObserver(c1);
        phone.setInStock(true);

        // Strategy
        PaymentContext payment = new PaymentContext();
        payment.setStrategy(new CreditCardPayment());
        payment.payAmount(299.99);

        // Singleton
        ShoppingCart cart = ShoppingCart.getInstance();
        cart.addItem("Laptop");
        cart.showItems();

        // Factory
        ProductFactoryType electronics = ProductFactory.createProduct("electronics");
        electronics.display();

        // Decorator
        ProductFeature product = new BaseProduct();
        product = new GiftWrap(product);
        product = new ExtendedWarranty(product);
        product.applyFeature();

        // Adapter
        Shipping shipping = new ShippingAdapter(new ExternalShippingService());
        shipping.ship("Laptop");
    }
}