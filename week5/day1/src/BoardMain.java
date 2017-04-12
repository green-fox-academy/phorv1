import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class BoardMain extends JComponent implements KeyListener {
  int canvasSize = 720;
  int tileSize = 72;
  Area board;
  Hero hero = new Hero(0, 0);
  List<Skeleton> listSkeleton;

  public void drawSkeleton() {
    int numberOfSkeletons = 2 + (int) (Math.random() * 3);
    listSkeleton = new ArrayList<>();
    for (int i = 0; i < numberOfSkeletons; i++) {
      int randomX = (int) (Math.random() * 10);
      int randomY = (int) (Math.random() * 10);
      while (!board.isFloor(randomX, randomY)) {
        randomX = (int) (Math.random() * 10);
        randomY = (int) (Math.random() * 10);
      }
      Skeleton skeleton = new Skeleton(randomX, randomY);
      listSkeleton.add(skeleton);
      }
    }

  public BoardMain() {
    setPreferredSize(new Dimension(canvasSize, canvasSize));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    board = new Area();
    board.fillFields("assets/wallposition.csv");
    board.paintTile(graphics);
    hero.draw(graphics);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    BoardMain board = new BoardMain();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    int currentPosX = hero.posX;
    int currentPosY = hero.posY;
    int x = currentPosX / tileSize;
    int y = currentPosY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tileSize && board.isFloor(x, y - 1)) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < tileSize * 9 && board.isFloor(x, y + 1)) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= tileSize && board.isFloor(x - 1, y)) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < tileSize * 9 && board.isFloor(x + 1, y)) {
      hero.moveRight();
    }
    repaint();
  }
}

