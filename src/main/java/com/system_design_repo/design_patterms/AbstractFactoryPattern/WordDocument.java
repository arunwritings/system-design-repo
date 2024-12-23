package com.system_design_repo.design_patterms.AbstractFactoryPattern;

public class WordDocument implements Document{

    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }

}

