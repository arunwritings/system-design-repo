package com.system_design_repo.design_patterms.AbstractFactoryPattern;

public class WordDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new WordDocument();
    }

}
