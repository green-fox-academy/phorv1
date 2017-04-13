import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

  private static ImageLoader instance;

  public BufferedImage FLOOR, WALL, HERO_UP, HERO_DOWN, HERO_LEFT, HERO_RIGHT, SKELETON, BOSS;

  private ImageLoader() {
    try {
      FLOOR = ImageIO.read(new File("assets/floor.png"));
      WALL = ImageIO.read(new File("assets/wall.png"));
      HERO_UP = ImageIO.read(new File("assets/hero-up.png"));
      HERO_DOWN = ImageIO.read(new File("assets/hero-down.png"));
      HERO_LEFT = ImageIO.read(new File("assets/hero-left.png"));
      HERO_RIGHT = ImageIO.read(new File("assets/hero-right.png"));
      SKELETON = ImageIO.read(new File("assets/skeleton.png"));
      BOSS = ImageIO.read(new File("assets/boss.png"));
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
