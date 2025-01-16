package com.system_design_repo.llds.to_do_list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoList {

    private final List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title, String description, int priority, LocalDateTime dueDate) {
        Task task = new Task(title, description, priority, dueDate);
        tasks.add(task);
        System.out.println("Task added: "+ task.getTitle());
    }

    public void removeTask(String title) {
        for (Iterator<Task> iterator = tasks.iterator(); iterator.hasNext();) {
            Task task = iterator.next();
            if (task.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Task removed: "+title);
            }
        }
    }

    public void updateTask(String title, String newTitle, String newDescription, int newPriority, LocalDateTime newDueDate) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                task.setPriority(newPriority);
                task.setDueDate(newDueDate);
                System.out.println("Task updated: " + newTitle);
            }
        }
    }

    public void markTaskAsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setCompleted(true);
                System.out.println("Task marked as completed: " + title);
            }
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public List<Task> getTasksByPriority(int priority) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority() == priority) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> getPendingTasks() {
        List<Task> pendingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

}
