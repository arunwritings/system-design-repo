package com.system_design_repo.design_patterns.ObserverDesignPattern;


import com.system_design_repo.design_patterns.ObserverDesignPattern.concreteClasses.PhoneDisplay;
import com.system_design_repo.design_patterns.ObserverDesignPattern.concreteClasses.TVDisplay;
import com.system_design_repo.design_patterns.ObserverDesignPattern.concreteClasses.WeatherStation;
import com.system_design_repo.design_patterns.ObserverDesignPattern.interfaces.Observer;

// Usage Class
public class WeatherApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);
        weatherStation.setWeather("Sunny");
    }

}
