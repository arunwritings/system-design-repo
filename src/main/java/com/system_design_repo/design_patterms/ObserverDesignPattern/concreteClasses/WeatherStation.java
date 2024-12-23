package com.system_design_repo.design_patterms.ObserverDesignPattern.concreteClasses;

import com.system_design_repo.design_patterms.ObserverDesignPattern.interfaces.Subject;
import com.system_design_repo.design_patterms.ObserverDesignPattern.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject Class
public class WeatherStation implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}
