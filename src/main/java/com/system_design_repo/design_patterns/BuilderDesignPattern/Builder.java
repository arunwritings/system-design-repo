package com.system_design_repo.design_patterns.BuilderDesignPattern;

// Builder Interface
public abstract class Builder {

    public abstract void buildCPU();
    public abstract void buildRAM();
    public abstract void buildStorage();

    public abstract Computer getResult();
}

