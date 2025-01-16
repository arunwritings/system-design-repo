package com.system_design_repo.llds.to_do_list;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private int priority;
    private boolean isCompleted;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;

    public Task(String title, String description, int priority, LocalDateTime dueDate) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
        this.createdAt = LocalDateTime.now();
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", isCompleted=" + isCompleted +
                ", createdAt=" + createdAt +
                ", dueDate=" + dueDate +
                '}';
    }
}
