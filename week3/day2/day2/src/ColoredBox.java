import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ColoredBox {

    public static void mainDraw(Graphics graphics){
        // draw a box that has different colored lines on each edge.
        graphics.setColor(Color.WHITE);
        graphics.clearRect(50, 50, 200, 200);
        graphics.setColor(Color.RED);
        graphics.drawLine(50, 50, 50, 250 );
        graphics.setColor(Color.GREEN);
        graphics.drawLine(50, 50, 250, 50);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(250, 50, 250, 250 );
        graphics.setColor(Color.BLACK);
        graphics.drawLine(50, 250, 250, 250);
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