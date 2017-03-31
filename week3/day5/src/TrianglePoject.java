import javax.swing.*;
import java.awt.*;

import static java.awt.Component.RIGHT_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglePoject {

  public static void mainDraw(Graphics graphics) {
    drawTriangle(graphics, 0, 0, 600);
    leftTri(graphics,0,0, 600);
  }

  public static void drawTriangle(Graphics graphics, int x, int y, int size) {
    int[] first = {x, size, size / 2};
    int[] second = {y, y, size/4*3};
    graphics.drawPolygon(first, second, 3);
    int[] third = {size / 2, size / 4, size / 4 *3};
    int[] forth = {y, size / 4 * 3 / 2, size / 4 * 3 / 2};
    graphics.drawPolygon(third, forth, 3);
  }

  public static void leftTri(Graphics graphics, int x, int y, int size) {
    if (size < 1) {
      return;
    } else {
      drawTriangle(graphics, x, y, size);
      leftTri(graphics,  x, y, size/2);
    }

  }
  /*public static void rightTri(Graphics graphics, int x, int y, int size) {
    if (size < 1) {
      return;
    } else {
      drawTriangle(graphics, x, y, size);
      rightTri(graphics, x, y , size/2);
    }
  }*/

  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(620, 500));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new TrianglePoject.ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }
}
