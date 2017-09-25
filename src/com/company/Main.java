package com.company;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        BreadWarehouse breadWarehouse = new BreadWarehouse();
        MilkWarehouse milkWarehouse = new MilkWarehouse();
        BeerWarehouse beerWarehouse = new BeerWarehouse();

        Summator sum1 = new Summator(10, 0, 0, semaphore);
        Summator sum2 = new Summator(0, 0, 1, semaphore);
        Summator sum3 = new Summator(0, 3, 0, semaphore);

        //sum1.breadWarehouse.addBread(10);
        //sum2.milkWarehouse.addMilk(1);
        //sum3.beerWarehouse.addBeer(3);

        new Thread(sum1).start();
        new Thread(sum2).start();
        new Thread(sum3).start();

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        breadWarehouse.printBread();
        milkWarehouse.printMilk();
        beerWarehouse.printBeer();

    }
}
