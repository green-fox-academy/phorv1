import java.awt.image.BufferedImage;

public class GameCharacter extends GameObject{
  int hp;
  int dp;
  int sp;

  public GameCharacter(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  void moveUp() {
    this.posY--;
  }

  void moveDown() {
    this.posY++;
  }

  void moveLeft() {
    this.posX--;
  }

  void moveRight() {
    this.posX++;
  }

  void faceUp() {
    setImage(ImageLoader.getInstance().HERO_UP);
  }

  void faceDown() {
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  void faceLeft() {
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  void faceRight() {
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }
}
