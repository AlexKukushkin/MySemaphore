package com.company;

public class Main {

    public static void main(String[] args) {
        BreadWarehouse breadWarehouse = new BreadWarehouse();
        MilkWarehouse milkWarehouse = new MilkWarehouse();
        BeerWarehouse beerWarehouse = new BeerWarehouse();
        Summator sum1 = new Summator(breadWarehouse);
        Summator sum2 = new Summator(milkWarehouse);
        Summator sum3 = new Summator(beerWarehouse);

        new Thread(sum1).start();
        new Thread(sum2).start();
        new Thread(sum3).start();
    }
}
