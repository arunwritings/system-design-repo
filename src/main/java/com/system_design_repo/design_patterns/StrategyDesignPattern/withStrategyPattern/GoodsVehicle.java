package com.system_design_repo.design_patterns.StrategyDesignPattern.withStrategyPattern;


import com.system_design_repo.design_patterns.StrategyDesignPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
