import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {
    int x1 = 0;
    int y1 = 0;
    int x2 = 300;
    int y2 = 0;
    for (int i = 0; i < 20; i++) {
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(x1, y1, x2, y2);
      x1 += 20;
      y2 += 20;
    }
    x1 = 0;
    y1 = 300;
    x2 = 300;
    y2 = 300;
    for (int i = 0; i < 20; i++) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x1, y1, x2, y2);
    y1 -= 20;
    x2 -= 20;
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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }

}