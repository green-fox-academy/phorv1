import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {

    public static void mainDraw(Graphics graphics){
        sizeColor(20,200, graphics);
    }

    public static void sizeColor(int size, int color, Graphics graphics) {
        int xx = 300;
        int random = color;

        while (xx > size){
            graphics.setColor(new Color(random));
            graphics.fillRect(150 - xx / 2, 150 - xx/ 2, xx, xx);
            xx -= 10;
            random = (int) (Math.random() * 16777215);
        }

        graphics.setColor (new Color(color));
        graphics.fillRect(150 - size / 2, 150 - size / 2, size, size);
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