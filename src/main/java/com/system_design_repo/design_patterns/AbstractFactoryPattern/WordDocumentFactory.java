package com.system_design_repo.design_patterns.AbstractFactoryPattern;

public class WordDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new WordDocument();
    }

}
