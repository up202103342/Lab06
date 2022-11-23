package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {
    public List<BarObserver> observers;
    public StringBar() { observers = new ArrayList<>(); is = false; }
    private boolean is;
    public boolean isHappyHour(){
        return is;
    }
    public void startHappyHour(){
        is = true;
        notifyObservers();
    }
    public void endHappyHour(){
        is = false;
        notifyObservers();
    }
    @Override
    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
