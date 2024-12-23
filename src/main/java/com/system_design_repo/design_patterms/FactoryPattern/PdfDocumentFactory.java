package com.system_design_repo.design_patterms.FactoryPattern;

public class PdfDocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }

}
