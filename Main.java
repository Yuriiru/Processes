package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        for (i= 0; i < 11; ++i) {
            (new HTh()).start();
        }

    }
}

     class HTh extends Thread {
        public void run() {

            System.out.println(getName());
        }
    }

