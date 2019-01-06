package com.ashishprodev.game;
import java.awt.*;

import java.awt.image.BufferedImage;

class AsciiArtGen{
    AsciiArtGen(){

    }
    void asciiFromText(String str) {
        int WIDTH = 150;
        int HEIGHT = 30;
        BufferedImage bf = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = bf.getGraphics();
        g.setFont(new Font("Arial", Font.BOLD, 24));
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2D.drawString(str, 10, 20);
        for (int y = 0; y < HEIGHT; y++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int x = 0; x < WIDTH; x++) {
                stringBuilder.append(bf.getRGB(x, y) == -16777216 ? " " : "@");
            }

            if (stringBuilder.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(stringBuilder);
        }


    }
}