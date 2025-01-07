package com.system_design_repo.design_patterns.BuilderDesignPattern;

// ConcreteBuilder Class
public class GamingComputerBuilder extends Builder {
    private final Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}

