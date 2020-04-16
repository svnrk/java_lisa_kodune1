package com.company;

import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Kujund extends Canvas {
    static int W = 1200;
    static int H = 700;

//    public static void main(String[] args) {
//        setup();
//    }

    public static void setup(){
        JFrame frame = new JFrame("Ülesanne 1");

        Canvas canvas = new Kujund();
        canvas.setSize(W, H);
        frame.add(canvas);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Arial", Font.BOLD, 15);
        g.setFont(font);
        g.drawString("R", 470, 340);
        g2.setStroke(new BasicStroke(4));
        g.drawLine(350, 350, 600, 350);
        g.setColor(Color.RED);
        g.drawRect(100, 100, 500, 500);
        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 500, 500);
    }
}
