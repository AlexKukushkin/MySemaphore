package com.company;

public class BeerWarehouse  {
    private static int counter;

    public static synchronized void addBeer(int count){
        counter += count;
    }
    public synchronized void printBeer(){
        System.out.println("Beer : " + counter);
    }
}
