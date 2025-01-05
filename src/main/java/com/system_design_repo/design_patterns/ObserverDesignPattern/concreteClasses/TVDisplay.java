package com.system_design_repo.design_patterns.ObserverDesignPattern.concreteClasses;


import com.system_design_repo.design_patterns.ObserverDesignPattern.interfaces.Observer;

// ConcreteObserver Class
public class TVDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
