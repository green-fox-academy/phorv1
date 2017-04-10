import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Character {
  int heroStartX = 0;
  int heroStartY = 0;
  int tileSize = 71;

  public void drawHero(Graphics graphics) {
    PositionedImage image = new PositionedImage("assets/hero-down.png", heroStartX, heroStartY);
    image.draw(graphics);
  }
}

