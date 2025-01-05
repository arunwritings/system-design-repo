package com.system_design_repo.design_patterns.SingletonPatterns;

public class FarmerDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Farmer farmer1 = Farmer.createInstance();
            System.out.println("Thread 1: Farmer instance hashcode: " + farmer1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            Farmer farmer2 = Farmer.createInstance();
            System.out.println("Thread 2: Farmer instance hashcode: " + farmer2.hashCode());
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
