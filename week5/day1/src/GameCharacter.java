import java.awt.image.BufferedImage;

public class GameCharacter extends GameObject{
  double hp;
  double dp;
  double sp;

  public GameCharacter(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  void moveUp() {
    this.posY--;
    setImage(ImageLoader.getInstance().HERO_UP);
  }

  void moveDown() {
    this.posY++;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  void moveLeft() {
    this.posX--;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  void moveRight() {
    this.posX++;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }
}
