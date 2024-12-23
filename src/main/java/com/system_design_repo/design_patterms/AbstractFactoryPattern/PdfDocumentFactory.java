package com.system_design_repo.design_patterms.AbstractFactoryPattern;

public class PdfDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

}
