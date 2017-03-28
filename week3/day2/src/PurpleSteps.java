import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics){
        purpleSquares(10, 10, graphics);
    }

    public static void purpleSquares(int position, int size, Graphics graphics) {
        int numberofsquares = 4;
        for (int i = position; i < position + size * numberofsquares; i+=size) {
        graphics.setColor(new Color (128,0,128));
        graphics.fillRect(i,i,size,size);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(i, i, size, size);
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}