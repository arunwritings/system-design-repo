package com.system_design_repo.design_patterms.StrategyDesignPattern.withStrategyPattern;


import com.system_design_repo.design_patterms.StrategyDesignPattern.withStrategyPattern.strategy.StrategyPattern;

public class Vehicle {

    StrategyPattern strategyPattern;

    Vehicle(StrategyPattern strategyPattern) {
        this.strategyPattern = strategyPattern;
    }

    public void drive() {
        strategyPattern.drive();
    }
}
