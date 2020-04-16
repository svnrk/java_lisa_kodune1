package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.printf("%nÜlesanne 1 %n%n");

        Kujund.setup();
        YL1.input();
        YL1.vastused();

        System.out.printf("%nÜlesanne 2 %n%n");
        YL2.input();
        YL2.vastused();

        System.out.printf("%nÜlesanne 3 %n%n");
        YL3.input();
        YL3.vastused();


    }
}
