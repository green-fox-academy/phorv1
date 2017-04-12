import java.awt.image.BufferedImage;

public class Character extends GameObject{
  double hp;
  double dp;
  double sp;

  public Character(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  public Character() {
  }
}
