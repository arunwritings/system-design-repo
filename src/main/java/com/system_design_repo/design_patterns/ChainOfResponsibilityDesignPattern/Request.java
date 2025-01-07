package com.system_design_repo.design_patterns.ChainOfResponsibilityDesignPattern;

// Request Class
class Request {
    private Priority priority;

    public Request(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
