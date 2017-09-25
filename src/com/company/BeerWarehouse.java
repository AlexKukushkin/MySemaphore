package com.company;

public class BeerWarehouse  {
    private int counter;

    public synchronized void addBeer(int count){
        this.counter += count;
    }
}
