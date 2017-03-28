import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoesCentre {

    public static void mainDraw(Graphics graphics) {
        // create a line drawing function that takes 2 parameters:
        // the x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // fill the canvas with lines from the edges, every 20 px, to the center.
        lining(graphics);

    }

    public static void lining(Graphics graphics) {
        int step = 20;
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < 320; i += step) {
                graphics.drawLine(i, 0, 150, 150);
                graphics.drawLine(0, i, 150, 150);
                graphics.drawLine(i, 320, 150, 150);
                graphics.drawLine(320, i, 150, 150);
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
            mainDraw(graphics);

        }
    }

}