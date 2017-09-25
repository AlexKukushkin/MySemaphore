package com.company;

public class MilkWarehouse {
    private int counter;

    public synchronized void addMilk(int count){
        this.counter += count;
    }
}
