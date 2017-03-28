import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {

    public static void mainDraw(Graphics graphics){
        horizontalLines(25, 60, graphics);
        horizontalLines(50, 80, graphics);
        horizontalLines(75, 120, graphics);
    }
    public static void horizontalLines (int x1, int y1, Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x1, y1,50 + x1, y1 );
    }
    //    Don't touch the code below
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