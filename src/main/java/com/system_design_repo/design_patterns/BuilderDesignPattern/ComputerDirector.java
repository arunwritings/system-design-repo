package com.system_design_repo.design_patterns.BuilderDesignPattern;

// Director Class: ComputerDirector
public class ComputerDirector {

    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}

