package com.system_design_repo.llds.to_do_list;

import java.time.LocalDateTime;

public class ToDoListDemo {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Adding tasks
        toDoList.addTask("Buy Groceries", "Buy milk, eggs, and bread.", 1, LocalDateTime.of(2025, 1, 20, 10, 0));
        toDoList.addTask("Complete Homework", "Math assignment due.", 2, LocalDateTime.of(2025, 1, 18, 15, 0));
        toDoList.addTask("Clean Room", "Organize books and clothes.", 3, LocalDateTime.of(2025, 1, 25, 12, 0));

        // Display all tasks
        toDoList.displayTasks();

        // Update a task
        toDoList.updateTask("Complete Homework", "Complete Math Assignment", "Math assignment due. Solve problems.", 1, LocalDateTime.of(2025, 1, 19, 15, 0));

        // Mark task as completed
        toDoList.markTaskAsCompleted("Buy Groceries");

        // Display pending tasks
        System.out.println("\nPending tasks:");
        for (Task task : toDoList.getPendingTasks()) {
            System.out.println(task);
        }

        // Display completed tasks
        System.out.println("\nCompleted tasks:");
        for (Task task : toDoList.getCompletedTasks()) {
            System.out.println(task);
        }

        // Remove a task
        toDoList.removeTask("Clean Room");

        // Display remaining tasks
        System.out.println("\nRemaining tasks:");
        toDoList.displayTasks();

    }
}
