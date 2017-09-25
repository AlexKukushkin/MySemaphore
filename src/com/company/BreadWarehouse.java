package com.company;

public class BreadWarehouse {
    private static int counter;

    public static synchronized void addBread(int count){
        counter += count;
    }
    public synchronized void printBread(){
        System.out.println("Bread : " + counter);
    }
}
