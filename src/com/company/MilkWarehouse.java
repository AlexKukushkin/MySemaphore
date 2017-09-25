package com.company;

public class MilkWarehouse {
    private static int counter;

    public static synchronized void addMilk(int count){
        counter += count;
    }
    public synchronized void printMilk(){
        System.out.println("Milk : " + counter);
    }
}
