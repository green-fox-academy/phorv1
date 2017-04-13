import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject {

  BufferedImage image;
  int posX, posY;

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public GameObject() {
  }

  public GameObject(BufferedImage image, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    setImage(image);
  }

  protected void setImage(BufferedImage image) {
    this.image = image;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * MainBoard.TILE_SIZE, posY * MainBoard.TILE_SIZE, null);
    }
  }
}