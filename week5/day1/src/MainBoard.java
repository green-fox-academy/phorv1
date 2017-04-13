import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class MainBoard extends JComponent implements KeyListener {
  final static int TILE_SIZE = 72;
  final static String FLOOR_REP = "0";
  final static int MAP_ROW = 10;
  final static int MAP_COLUMN = 10;
  final static int CANVAS_WIDTH = MAP_COLUMN * TILE_SIZE;
  final static int CANVAS_HEIGHT = MAP_ROW * TILE_SIZE;

  Area board;
  Hero hero;
  List<GameCharacter> listCharacter;
  List<Skeleton> listSkeleton;
  Skeleton skeleton;
  Boss boss;

  public MainBoard() {
    setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    setVisible(true);

    board = new Area();
    board.fillFields("assets/wallposition.csv");
    listCharacter = new ArrayList<>();
    hero = new Hero(0, 0);
    listCharacter.add(hero);
    boss = new Boss(1, 1);
    listCharacter.add(boss);
    createSkeletons();
  }

  public void createSkeletons() {
    int numberOfSkeletons = 2 + (int) (Math.random() * 3);
    System.out.println(numberOfSkeletons);
    listSkeleton = new ArrayList<>();
    for (int i = 0; i < numberOfSkeletons; i++) {
      int randomX = (int) (Math.random() * MAP_COLUMN);
      int randomY = (int) (Math.random() * MAP_ROW);
      while (!board.isFloorAtPosition(randomX, randomY)
              || isThereCharacterOnTile(randomX,randomY)) {
        randomX = (int) (Math.random() * MAP_COLUMN);
        randomY = (int) (Math.random() * MAP_ROW);
      }
      skeleton = new Skeleton(randomX, randomY);
      System.out.println(skeleton.getPosX() + "   " + skeleton.getPosY());
      listSkeleton.add(skeleton);
      listCharacter.add(skeleton);
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    board.paintTile(graphics);
    hero.draw(graphics);
    boss.draw(graphics);
    for (Skeleton skeleton : listSkeleton) {
      skeleton.draw(graphics);
    }
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("RPG Game");
    MainBoard board = new MainBoard();

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
    int x = currentPosX;
    int y = currentPosY;

    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY > 0 && board.isFloorAtPosition(x, y - 1)) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < (MAP_ROW - 1) && board.isFloorAtPosition(x, y + 1)) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX > 0 && board.isFloorAtPosition(x - 1, y)) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < (MAP_COLUMN - 1) && board.isFloorAtPosition(x + 1, y)) {
      hero.moveRight();
    }
    repaint();
  }

  public boolean isThereCharacterOnTile(int inThatX, int inThatY) {
    for (GameCharacter character : listCharacter) {
      if ((character.getPosX() == inThatX) && (character.getPosY() == inThatY)) {
        return true;
      }
    }
    return false;
  }

}

