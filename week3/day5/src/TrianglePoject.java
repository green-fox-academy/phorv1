import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglePoject {

  public static void mainDraw(Graphics graphics) {
    leftTri(graphics, 450, 600, 300, 260);
  }

  public static void drawTriangle(Graphics graphics, int x, int y, int l, int h) {
    int[] first = {x, x + l, x - l};
    int[] second = {y , y - h * 2 , y - h * 2};
    graphics.drawPolygon(first, second, 3);
  }

  public static void leftTri(Graphics graphics, int x, int y, int l, int h) {
    if (l < 1) {
      return;
    } else {
      drawTriangle(graphics, x, y, l, h);
      leftTri(graphics, x, y, l / 2, h / 2);
      leftTri(graphics, x - l / 2, y - h , l / 2, h / 2);
      leftTri(graphics, x + l / 2, y - h , l / 2, h / 2);

    }

  }

  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 650));
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
