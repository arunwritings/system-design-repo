package com.system_design_repo.design_patterns.AdopterDesignPattern;

// Client Code
public class AdapterPatternExample {
    public static void clientCode(Printer printer) {
        printer.print();
    }

    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        PrinterAdapter adapter = new PrinterAdapter(legacyPrinter);
        clientCode(adapter);
    }
}
