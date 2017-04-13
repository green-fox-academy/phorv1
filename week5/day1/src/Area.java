import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Area extends GameObject {
  String[][] fields = new String[MainBoard.MAP_COLUMN][MainBoard.MAP_ROW];
  Path walls;

  public void fillFields(String levelPath) {
    this.walls = Paths.get(levelPath);
    try {
      List<String> lines = Files.readAllLines(walls);
      for (int i = 0; i < lines.size(); i++) {
        String[] row = lines.get(i).split(";");
        fields[i] = row;
      }
    } catch (Exception e) {
    }
  }

  public Area() {
  }

  public boolean isFloorAtPosition(int x, int y) {
    if ((fields[x][y]).equals(MainBoard.FLOOR_REP)) {
      return true;
    } else {
      return false;
    }
  }

  public void paintTile(Graphics graphics) {
    for (int i = 0; i < MainBoard.MAP_COLUMN; i++) {
      for (int j = 0; j < MainBoard.MAP_ROW; j++) {
        if (isFloorAtPosition(i, j)) {
          GameObject image = new GameObject(ImageLoader.getInstance().FLOOR, i * MainBoard.TILE_SIZE, j * MainBoard.TILE_SIZE);
          image.draw(graphics);
        } else {
          GameObject image = new GameObject(ImageLoader.getInstance().WALL, i * MainBoard.TILE_SIZE, j * MainBoard.TILE_SIZE);
          image.draw(graphics);
        }
      }
    }
  }
}
