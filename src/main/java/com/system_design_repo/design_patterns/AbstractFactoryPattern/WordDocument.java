package com.system_design_repo.design_patterns.AbstractFactoryPattern;

public class WordDocument implements Document{

    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }

}

