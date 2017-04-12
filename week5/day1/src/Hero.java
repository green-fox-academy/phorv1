
public class Hero extends Character {

  int tileSize = 71;

  public Hero(int posX, int posY) {
    super("assets/hero-down.png", posX, posY);
  }

  public void moveUp() {
    this.posY -= tileSize;
    setImage("assets/hero-up.png");
  }
  public void moveDown() {
    this.posY += tileSize;
    setImage("assets/hero-down.png");
  }

  public void moveLeft() {
    this.posX -= tileSize;
    setImage("assets/hero-left.png");
  }

  public void moveRight() {
    this.posX += tileSize;
    setImage("assets/hero-right.png");
  }
}


