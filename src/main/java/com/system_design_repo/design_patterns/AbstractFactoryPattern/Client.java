package com.system_design_repo.design_patterns.AbstractFactoryPattern;

public class Client {

    public static void main(String[] args) {

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();
    }
}
