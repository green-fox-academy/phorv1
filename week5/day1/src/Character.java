import javax.swing.*;

public class Character extends GameObject{
  double hp;
  double dp;
  double sp;

  public Character(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }
}
