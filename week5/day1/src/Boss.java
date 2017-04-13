import java.awt.image.BufferedImage;

public class Boss extends Monster {
  public Boss(int posX, int posY) {
    super(ImageLoader.getInstance().BOSS, posX, posY);
  }
}
