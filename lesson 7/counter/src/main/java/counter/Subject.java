package counter;

import java.util.ArrayList;
import java.util.Collection;

public class Subject {

    private Collection<CounterObserver> observers = new ArrayList<>();

    public void addObserver(CounterObserver observer) {
        observers.add(observer);
    }

    public void doNotify(int count) {
        for (CounterObserver observer: observers) {
            observer.update(count);
        }
    }
}
