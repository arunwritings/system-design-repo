package com.system_design_repo.design_patterms.StrategyDesignPattern.withStrategyPattern.strategy;

public class NormalDriveStrategy implements StrategyPattern {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
