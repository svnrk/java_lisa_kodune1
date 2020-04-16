package com.company;

import javax.swing.*;
import java.awt.*;

public class Kujund2 extends Canvas {
    static int W = 1200;
    static int H = 700;

//    public static void main(String[] args) {
//        setup();
//    }

    public static void setup(){
        JFrame frame = new JFrame("Ülesanne 1");

        Canvas canvas = new Kujund2();
        canvas.setSize(W, H);
        frame.add(canvas);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.WHITE);
        g.fillRect(0,0,W,H);
        g.setColor(Color.BLUE);
        g.fillOval(600, 100, 500, 500);
        g.setColor(Color.RED);
        g.fillRect(100, 100, 500, 500);

    }
}
