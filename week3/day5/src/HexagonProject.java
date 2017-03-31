import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonProject {

  public static void mainDraw(Graphics graphics) {
    drawAbeeHome(graphics, 50, 50, 120, 210);
    fractals(graphics, 50, 50, 120, 210);
  }

  public static void drawAbeeHome(Graphics graphics, int j, int i, int l, int h) {
    int xpoints[] = {i, i + l, i + (3 * l), i + (4 * l), i + (3 * l), i + l};
    int ypoints[] = {j + h, j, j, j + h, j + (2 * h), j + (2 * h)};
    int npoints = 6;
    graphics.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void fractals(Graphics graphics, int j, int i, int l, int h) {
    if (l < 1) {
      return;
    } else {
      drawAbeeHome(graphics, j, i, l, h);
      fractals(graphics, j, i + (l / 3) * 2, l / 3, h / 3);
      fractals(graphics, j, i + (l / 3) * 6, l / 3, h / 3);
      fractals(graphics, j + (h / 3) * 2, i, l / 3, h / 3);
      fractals(graphics, j + (h / 3) * 2, i + (l / 3) * 8, l / 3, h / 3);
      fractals(graphics, j + (h / 3) *4, i + (l / 3) * 2, l / 3, h / 3);
      fractals(graphics, j + (h / 3) *4, i + (l / 3) * 6, l / 3, h / 3);
    }
  }

  /*public static void smallerfractals (Graphics graphics, int j, int i, int l, int h) {

  }*/
  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 630));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new HexagonProject.ImagePanel());
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
