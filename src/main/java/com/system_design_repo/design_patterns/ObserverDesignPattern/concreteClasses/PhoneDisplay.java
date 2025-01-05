package com.system_design_repo.design_patterns.ObserverDesignPattern.concreteClasses;


import com.system_design_repo.design_patterns.ObserverDesignPattern.interfaces.Observer;

// ConcreteObserver Class
public class PhoneDisplay implements Observer {

    private String weather;

    @Override
    public void update(String Weather) {
        this.weather = Weather;
        display();
    }

    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
