package com.system_design_repo.design_patterns.AbstractFactoryPattern;

public class PdfDocument implements Document{

    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }

}
