import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangle {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.fillRect(10, 20, 20, 25);
        graphics.setColor(Color.GRAY);
        graphics.fillRect(35, 15, 15, 30);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(75, 60, 25, 40);
        graphics.setColor(Color.RED);
        graphics.fillRect(90, 85, 54, 12);

    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(320, 343));
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