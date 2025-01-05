package com.system_design_repo.design_patterns.SingletonPatterns;

public class Farmer {

    private Farmer() {
        System.out.println("Private Constructor");
    }

    private static Farmer farmer;

    public static Farmer createInstance() {
        if (farmer == null) {
            synchronized (Farmer.class) {
                if (farmer == null) {
                    farmer = new Farmer();
                }
            }
        }
        return farmer;
    }
}
