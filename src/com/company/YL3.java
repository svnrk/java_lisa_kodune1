package com.company;
import javax.swing.JOptionPane;

public class YL3 {
    static double temperatuur;
    static String hinnang;

    static void input(){
        String input = JOptionPane.showInputDialog(null, "Sisesta temperatuur (Celsius)",
                "Temperatuuri sisestamine", JOptionPane.QUESTION_MESSAGE);
        temperatuur = Double.parseDouble(input);
    }

    static void temperatuuriHinnang(double temperatuur){

        if (temperatuur < -273.15){
            hinnang = "Ebasobiv sisend";
        }
        else if (temperatuur < 10){
            hinnang = "Cold!";
        }
        else if (temperatuur < 25){
            hinnang = "Warm";
        }
        else{
            hinnang = "Hot!";
        }
    }

    public static void vastused(){
        temperatuuriHinnang(temperatuur);
        System.out.println(hinnang);
        JOptionPane.showMessageDialog(null, hinnang);
    }

//    public static void main(String[] args) {
////        input();
////        vastused();
////    }

}
