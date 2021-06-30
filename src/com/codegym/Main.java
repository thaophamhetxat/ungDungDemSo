package com.codegym;

public class Main {

    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("MAIN thread will be alive till child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
