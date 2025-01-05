package com.system_design_repo.design_patterns.DecoratorDesignPattern;

public class CoffeeShop {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " - Rs " + simpleCoffee.cost());

        // Adding milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " - Rs " + milkCoffee.cost());

        // Adding sugar to the coffee with milk
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " - Rs " + milkSugarCoffee.cost());
    }
}
