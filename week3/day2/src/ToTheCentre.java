import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ToTheCentre {

    public static void mainDraw(Graphics graphics){
        lines(25, 120, graphics);
        lines(25, 100, graphics);
        lines(25, 250, graphics);
    }

    public static void lines(int x1, int y1, Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x1, y1, 150, 150);

    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(300, 300));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}