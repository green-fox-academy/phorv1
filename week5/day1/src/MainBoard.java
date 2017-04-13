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
    createSkeletons();
    createBoss();
  }

  public void createBoss() {
    int[] randomXY = generateValidRandomXY();
    boss = new Boss(randomXY[0], randomXY[1]);
    listCharacter.add(boss);
  }


  public void createSkeletons() {
    int numberOfSkeletons = 2 + (int) (Math.random() * 3);
    System.out.println(numberOfSkeletons);
    for (int i = 0; i < numberOfSkeletons; i++) {
      int[] randomXY = generateValidRandomXY();
      skeleton = new Skeleton(randomXY[0], randomXY[1]);
      listCharacter.add(skeleton);
    }
  }

  private int[] generateValidRandomXY() {
    int[] validXY = new int[2];
    int randomX;
    int randomY;

    do {
      randomX = (int) (Math.random() * MAP_COLUMN);
      randomY = (int) (Math.random() * MAP_ROW);
    } while (!board.isFloorAtPosition(randomX, randomY)
            || isThereCharacterOnTile(randomX,randomY));
    validXY[0] = randomX;
    validXY[1] = randomY;
    return validXY;

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    board.paintTile(graphics);
    for (GameCharacter character : listCharacter) {
      character.draw(graphics);
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.faceUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.faceDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.faceLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.faceRight();
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    int x = hero.posX;
    int y = hero.posY;

    if (e.getKeyCode() == KeyEvent.VK_UP
            && y > 0
            && board.isFloorAtPosition(x, y - 1)) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN
            && y < (MAP_ROW - 1)
            && board.isFloorAtPosition(x, y + 1)) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT
            && x > 0
            && board.isFloorAtPosition(x - 1, y)) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT
            && x < (MAP_COLUMN - 1)
            && board.isFloorAtPosition(x + 1, y)) {
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

