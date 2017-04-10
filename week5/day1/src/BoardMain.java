
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BoardMain extends JComponent implements KeyListener {


  int canvasSize = 720;
  int tileSize = 71;
  int heroStartX = 0;
  int heroStartY = 0;

  public BoardMain() {
    setPreferredSize(new Dimension(canvasSize, canvasSize));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    for (int i = 0; i < canvasSize - tileSize; i += tileSize) {
      for (int j = 0; j < canvasSize - tileSize; j += tileSize) {
        PositionedImage image = new PositionedImage("assets/floor.png", i, j);
        image.draw(graphics);
      }
    }
    PositionedImage image = new PositionedImage("assets/hero-down.png", heroStartX, heroStartY);
    image.draw(graphics);
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    BoardMain board = new BoardMain();
    frame.add(board);
    frame.setVisible(true);

    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      heroStartY -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroStartY += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroStartX -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroStartX += tileSize;
    }
    // and redraw to have a new picture with the new coordinates
    invalidate();
    repaint();
  }
}
