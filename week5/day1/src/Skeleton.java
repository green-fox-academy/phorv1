
import java.lang.*;

public class Skeleton extends Character {

  public Skeleton (int posX, int posY) {
    super(ImageLoader.getInstance().SKELETON, posX, posY);
    this.posX= (int) (Math.random() * (720 - 71));
    this.posY= (int) (Math.random() * (720 - 71));
  }

  public Skeleton() {
  }
}
