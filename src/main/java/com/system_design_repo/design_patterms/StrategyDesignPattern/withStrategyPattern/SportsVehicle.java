package com.system_design_repo.design_patterms.StrategyDesignPattern.withStrategyPattern;


import com.system_design_repo.design_patterms.StrategyDesignPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
