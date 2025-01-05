package com.system_design_repo.design_patterns.StrategyDesignPattern.withoutStrategyPattern;

public class SportsVehicle extends Vehicle{

    //Different drive logic
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}