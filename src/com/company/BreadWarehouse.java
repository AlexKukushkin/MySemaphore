package com.company;

public class BreadWarehouse {
    private int counter;

    public synchronized void addBread(int count){
        this.counter += count;
    }
}
