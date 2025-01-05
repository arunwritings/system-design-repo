package com.system_design_repo.design_patterns.DecoratorDesignPattern;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 10;
    }

}