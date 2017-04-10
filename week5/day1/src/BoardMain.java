
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BoardMain extends JComponent implements KeyListener {
  int canvasSize = 720;
  Hero hero = new Hero();
  Tile tile = new Tile();
  int heroStartX = 0;
  int heroStartY = 0;
  int tileSize = 71;


  public BoardMain() {
    setPreferredSize(new Dimension(canvasSize, canvasSize));
    setVisible(true);
  }

  public void paint(Graphics graphics) {
    super.paint(graphics);
    PositionedImage image = new PositionedImage("assets/hero-down.png", heroStartX, heroStartY);
    tile.paintWall("assets/wallposition.csv");
    tile.paintTile(graphics);
    image.draw(graphics);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    BoardMain board = new BoardMain();
    frame.add(board);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      heroStartY -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroStartY += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroStartX -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroStartX += tileSize;
      invalidate();
      repaint();
    }
  }
}
