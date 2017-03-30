import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquares {
  static int SIZE = 600;
  static int WIDTH = 610;
  static int HEIGHT = 640;


  public static void mainDraw(Graphics g){
    smallerSquares(g, 0, 0, SIZE);
  }

  public static void square(Graphics g, int x, int y, int SIZE) {
    g.drawLine(x +SIZE/3, y, x + SIZE/3, y + SIZE);
    g.drawLine(x + (SIZE/3)*2, y,x + (SIZE/3)*2, y + SIZE);
    g.drawLine(x,y + SIZE/3, x + SIZE, y + SIZE/3);
    g.drawLine(x,y + (SIZE/3)*2, x + SIZE, y + (SIZE/3)*2);
  }

  public static void smallerSquares(Graphics g, int x, int y, int SIZE) {
    if (SIZE < 1){
      return;
    } else {
      square(g, x, y, SIZE);
      smallerSquares(g, x + SIZE/3, y, SIZE/3);
      smallerSquares(g, x, y + SIZE/3, SIZE/3);
      smallerSquares(g, x + SIZE/3*2, y + SIZE/3, SIZE/3);
      smallerSquares(g, x + SIZE/3, y + SIZE/3 *2, SIZE/3 );
    }
  }


  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.setBackground(Color.YELLOW);
      mainDraw(g);
    }
  }

}