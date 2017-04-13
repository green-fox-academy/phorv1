
public class Hero extends GameCharacter {

  public Hero(int posX, int posY) {
    super(ImageLoader.getInstance().HERO_DOWN, posX, posY);
    level = 1;
    hp = 20 + 3 * MainBoard.rollDice();
    dp = 2 * MainBoard.rollDice();
    sp = 5 + MainBoard.rollDice();
  }
}


