package com.company;

import java.util.concurrent.Semaphore;

public class Summator implements Runnable {

    private static int bread = 0;
    private static int milk = 0;
    private static int beer = 0;

    public Summator(int bread, int milk, int beer) {
        this.bread = bread;
        this.milk = milk;
        this.beer = beer;
    }

    public synchronized void addProduct(int bread, int milk, int beer) {
        BreadWarehouse.addBread(bread);
        MilkWarehouse.addMilk(milk);
        BeerWarehouse.addBeer(beer);
    }

    public void run() {
        addProduct(bread, milk, beer);
    }
}