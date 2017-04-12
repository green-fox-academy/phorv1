import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

  private static ImageLoader instance;

  public BufferedImage FLOOR;
  public BufferedImage WALL;
  public BufferedImage HERO_UP;
  public BufferedImage HERO_DOWN;
  public BufferedImage HERO_LEFT;
  public BufferedImage HERO_RIGHT;

  private ImageLoader() {
    try {
      FLOOR = ImageIO.read(new File("assets/floor.png"));
      WALL = ImageIO.read(new File("assets/wall.png"));
      HERO_UP = ImageIO.read(new File("assets/hero-up.png"));
      HERO_DOWN = ImageIO.read(new File("assets/hero-down.png"));
      HERO_LEFT = ImageIO.read(new File("assets/hero-left.png"));
      HERO_RIGHT = ImageIO.read(new File("assets/hero-right.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ImageLoader getInstance() {
    if (instance == null) {
      instance = new ImageLoader();
    }
    return  instance;
  }
}
