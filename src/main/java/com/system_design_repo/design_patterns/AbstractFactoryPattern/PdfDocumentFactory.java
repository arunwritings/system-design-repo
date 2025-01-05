package com.system_design_repo.design_patterns.AbstractFactoryPattern;

public class PdfDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

}
