package com.system_design_repo.design_patterns.FactoryPattern;

public class PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}
