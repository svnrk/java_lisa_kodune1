package com.company;

import java.util.Scanner;

public class YL2 {
    private static double palgat6us;
    private static int palgaPiir;
    private static int palkadeArv;
    private static int[] palgad;

    static void input(){
        System.out.println("Sisesta palkade arv: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            palkadeArv = input.nextInt();
            if (palkadeArv < 0) {
                palkadeArv = 10;
            }
        }
        else{ palkadeArv = 10; }

        System.out.println("Sisesta palk, millest väiksematele rakendub palgatõus: ");
        input = new Scanner(System.in);
        if (input.hasNextInt()) {
            palgaPiir = input.nextInt();
            if (palgaPiir < 0) {
                palgaPiir = 1000;
            }
        }
        else{ palgaPiir = 1000; }

        System.out.println("Sisesta palgatõusu protsent: ");
        input = new Scanner(System.in);
        if (input.hasNextInt()){
            palgat6us = (double) (100 + input.nextInt())/100;
            if (palgat6us < 1){
                palgat6us = 1.05;
            }
        }
        else{ palgat6us = 1.05; }
    }

    static void valmistaPalgaMassiiv(){
        palgad = new int[palkadeArv];
        int max = palgaPiir * 3/2;
        int min = palgaPiir * 2/3;
        for (int i = 0; i < palgad.length ; i++){
            palgad[i] = (int) ((Math.random()*(max-min))+min);
        }
        System.out.printf("Genereeriti %d juhusliku palga suurust vahemikus %d kuni %d%n%n", palkadeArv, min, max);
    }

    static int rakendaPalgat6us(int palk, int palgaPiir, double palgat6us){
        if (palk < palgaPiir){
            palk *= palgat6us;
        }
        return palk;
    }

    public static void vastused() {
        valmistaPalgaMassiiv();
        int[] vanadPalgad = palgad.clone();
        int palgat6usudeArv=0;
        System.out.println("Vana palk   Uus palk");
        for (int i=0; i < palgad.length; i++){

            palgad[i] = rakendaPalgat6us(palgad[i], palgaPiir, palgat6us);

            if (palgad[i] == vanadPalgad[i]){
                System.out.printf("%6d  %10d%n￿", vanadPalgad[i], palgad[i]);
            }
            else{
                System.out.printf("%6d \u001B[32m %10d %n\u001B[0m￿", vanadPalgad[i], palgad[i]);
                palgat6usudeArv++;
            }
        }
        System.out.println("Palgatõusu rakendati " + palgat6usudeArv + " korda");
    }
}
