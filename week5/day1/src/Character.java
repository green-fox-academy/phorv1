import java.awt.image.BufferedImage;

public class Character extends GameObject{
  double hp;
  double dp;
  double sp;

  public Character(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  void moveUp() {
    this.posY -= MainBoard.TILE_SIZE;
    setImage(ImageLoader.getInstance().HERO_UP);
  }

  void moveDown() {
    this.posY += MainBoard.TILE_SIZE;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  void moveLeft() {
    this.posX -= MainBoard.TILE_SIZE;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  void moveRight() {
    this.posX += MainBoard.TILE_SIZE;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }
}
