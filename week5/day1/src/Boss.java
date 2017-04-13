public class Boss extends Monster {
  public Boss(int posX, int posY) {
    super(ImageLoader.getInstance().BOSS, posX, posY);
    level = 1;
    hp = 2 * level * MainBoard.rollDice() + MainBoard.rollDice();
    dp = level / 2 * MainBoard.rollDice() + MainBoard.rollDice() / 2;
    sp = level * MainBoard.rollDice() + level;
  }
}
