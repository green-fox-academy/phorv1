import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleStepsSecond {

    public static void mainDraw(Graphics graphics){
        purpleSquares(10, graphics);
    }

    public static void purpleSquares(int size, Graphics graphics) {
                int numberofsquares = 6;
                int position = 10;
        for (int i = 0; i < numberofsquares; i++) {
            graphics.setColor(new Color (128,0,128));
            graphics.fillRect(position,position,size,size);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(position, position, size, size);
            size+= 10;
            position += size-10;
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