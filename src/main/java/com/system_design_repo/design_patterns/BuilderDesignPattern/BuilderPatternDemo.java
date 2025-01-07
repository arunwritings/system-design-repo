package com.system_design_repo.design_patterns.BuilderDesignPattern;

// Client Code
public class BuilderPatternDemo {

    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();
        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();
        gamingComputer.displayInfo();
    }
}

