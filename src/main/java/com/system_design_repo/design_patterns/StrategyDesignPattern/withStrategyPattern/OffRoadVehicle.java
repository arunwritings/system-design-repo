package com.system_design_repo.design_patterns.StrategyDesignPattern.withStrategyPattern;


import com.system_design_repo.design_patterns.StrategyDesignPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
