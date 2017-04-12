
public class Hero extends Character {

  int tileSize = 72;

  public Hero(int posX, int posY) {
    super(ImageLoader.getInstance().HERO_DOWN, posX, posY);
  }

  public void moveUp() {
    this.posY -= tileSize;
    setImage(ImageLoader.getInstance().HERO_UP);
  }
  public void moveDown() {
    this.posY += tileSize;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  public void moveLeft() {
    this.posX -= tileSize;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  public void moveRight() {
    this.posX += tileSize;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }
}


