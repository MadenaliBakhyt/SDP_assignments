import java.util.LinkedList;

public class FilmsApp implements Subject {
    private String film;
    private String theatre;
    private LinkedList<Observer> observers = new LinkedList<>();

    public void newFilm(String film,String theatre){
        this.film =film;
        this.theatre =theatre;
        dataChanged();
    }

    public void dataChanged(){
        notifyObservers();
    }


    public String getFilm(){
        return film;
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
        observers.forEach(observer -> observer.update(film,theatre));
    }
}