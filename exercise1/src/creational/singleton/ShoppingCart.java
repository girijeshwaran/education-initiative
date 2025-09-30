package creational.singleton;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> items;
    private ShoppingCart() { items = new ArrayList<>(); }
    public static ShoppingCart getInstance() {
        if (instance == null) instance = new ShoppingCart();
        return instance;
    }
    public void addItem(String item) { items.add(item); }
    public void showItems() { System.out.println("Cart Items: " + items); }
}