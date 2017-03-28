import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics) {
        // fill the canvas with a checkerboard pattern.
        int size = 38;
        int x = 38;
        for (int i = x; i < 300; i += x*2) {
            for (int j = 0; j < 300; j += x*2) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(i, j, size, size);
            }
        }
        for (int i = 0; i < 300; i += x*2) {
            for (int j = x; j < 300; j += x*2) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(i, j, size, size);
            }
        }
    }

    //    Don't touch the code below
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(320, 343));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            this.setBackground(Color.WHITE);
            mainDraw(graphics);

        }
    }

}