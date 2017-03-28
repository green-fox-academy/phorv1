import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquarePositioning {

    public static void mainDraw(Graphics graphics){
        square(10,10,graphics);
        square(70,70,graphics);
        square(10,120,graphics);

    }

    public static void square(int x, int y, Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillRect(x, y, 50, 50);
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