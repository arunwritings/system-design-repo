package com.system_design_repo.design_patterms.ObserverDesignPattern.interfaces;



public interface Subject {  // Subject Interface

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
