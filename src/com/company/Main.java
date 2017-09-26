package com.company;


public class Main {

    public static void main(String[] args) {
        BreadWarehouse breadWarehouse = new BreadWarehouse();
        MilkWarehouse milkWarehouse = new MilkWarehouse();
        BeerWarehouse beerWarehouse = new BeerWarehouse();

        Summator sum1 = new Summator(10, 0, 0);
        Summator sum2 = new Summator(0, 0, 1);
        Summator sum3 = new Summator(0, 3, 0);

        new Thread(sum1).start();
        new Thread(sum2).start();
        new Thread(sum3).start();

        breadWarehouse.printBread();
        milkWarehouse.printMilk();
        beerWarehouse.printBeer();
    }
}
