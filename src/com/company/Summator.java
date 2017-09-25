package com.company;

public class Summator {

    public Summator() {
    }

    public synchronized void addProduct(int product) {
        while (product != 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Продуктов на складе: " + product);
        notify();
    }

    public void run(){

    }
}