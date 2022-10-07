import java.util.ArrayList;
public class OnlineShop implements Subject {
    private String product;
    private ArrayList<Observer> observers = new ArrayList<>();

    public void newProduct(String product){
        this.product=product;
        notifyObservers();
    }

    public String getProduct(){
        return product;
    }

    public ArrayList<Observer> getObservers(){
        return observers;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add((observer));
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove((observer));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(product));
    }
}