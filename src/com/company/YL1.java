package com.company;

//Ruudu sees asub ring. Ringi raadius on 3.
//Leia ja väljasta ekraanile ruudu pindala, ruudu ümbermõõt, ringi pindala, ringi ümbermõõt. Kasuta Math.PI.

import java.util.Scanner;

public class YL1 {
    static double raadius;
    static double ruuduPindala;
    static double ruudu9mberm66t;
    static double ringiPindala;
    static double ringi9mberm66t;


    static void input(){
        System.out.println("Sisesta ringi raadius: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextDouble()){
            raadius = Math.abs(input.nextDouble());
        }
        else {
            raadius = 3;
        }
        System.out.println("Sisestatud raadius:  " + raadius);

    }

    static double ringiPindala(double raadius){
        ringiPindala = Math.PI * raadius * raadius;
        return ringiPindala;
    }

    static double ringi9mberm66t(double raadius){
        ringi9mberm66t = Math.PI * raadius * 2;
        return ringi9mberm66t;
    }

    static double ruuduPindala(double raadius){
        ruuduPindala = raadius * raadius * 4;
        return ruuduPindala;
    }
    static double ruudu9mberm66t(double raadius){
        ruudu9mberm66t = raadius * 8;
        return ruudu9mberm66t;
    }

    public static void vastused(){
        String ruuduP = "Ruudu ümbermõõt:";
        String ruuduA = "Ruudu pindala:";
        String ringiP = "Ringi ümbermõõt:";
        String ringiA = "Ringi pindala:";
        System.out.printf("\u001B[31m%-20s %8.2f%n%-20s %8.2f%n\u001B[34m%-20s %8.2f%n%-20s %8.2f%n\u001B[0m",
                ruuduA, YL1.ruuduPindala(raadius), ruuduP, YL1.ruudu9mberm66t(raadius),
                ringiA, YL1.ringiPindala(raadius), ringiP, YL1.ringi9mberm66t(raadius));

    }





}
