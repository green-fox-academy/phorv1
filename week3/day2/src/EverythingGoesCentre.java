import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoesCentre {

    public static void mainDraw(Graphics graphics) {
        // create a line drawing function that takes 2 parameters:
        // the x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // fill the canvas with lines from the edges, every 20 px, to the center.
        lining(0, 0, graphics);

    }

    public static void lining(int x, int y, Graphics graphics) {
        int step = 20;
        for (int i = 0; i < 320; i += step) {
                graphics.setColor(Color.BLACK);
            for (int j = 0; j < 320; j +=step) {
                graphics.drawLine(j, i, 150, 150);

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
            mainDraw(graphics);

        }
    }

}