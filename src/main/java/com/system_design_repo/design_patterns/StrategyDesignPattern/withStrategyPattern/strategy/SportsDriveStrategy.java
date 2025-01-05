package com.system_design_repo.design_patterns.StrategyDesignPattern.withStrategyPattern.strategy;

public class SportsDriveStrategy implements StrategyPattern {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
