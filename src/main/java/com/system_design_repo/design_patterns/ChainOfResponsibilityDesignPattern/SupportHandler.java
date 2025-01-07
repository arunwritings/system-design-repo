package com.system_design_repo.design_patterns.ChainOfResponsibilityDesignPattern;

// Handler Interface
interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}
