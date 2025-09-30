package behavioral.observer;
import java.util.*;
public class Product implements Subject {
    private String name;
    private boolean inStock;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name, boolean inStock) {
        this.name = name;
        this.inStock = inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) notifyObservers();
    }

    @Override
    public void addObserver(Observer o) { observers.add(o); }

    @Override
    public void removeObserver(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(name);
        }
    }
}