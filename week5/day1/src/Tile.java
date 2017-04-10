
import java.awt.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class Tile {
  int tileSize = 71;
  String[][] wallPosition = new String[10][10];
  Path paths;

  public void paintWall(String levelPath) {
    this.paths = Paths.get("assets/wallposition.csv");
    try {
      List<String> lines = Files.readAllLines(paths);
      for (int i = 0; i < lines.size(); i++) {
        String[] row = lines.get(i).split(";");
        wallPosition[i] = row;
      }
    } catch (Exception e) {
    }
  }

  public boolean isWall(int x, int y) {
    if ((wallPosition[x][y]).equals("1")) {
      return true;
    } else {
      return false;
    }
  }
  
  public void paintTile(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (!isWall(i, j)) {
          PositionedImage image = new PositionedImage("assets/floor.png", j * tileSize, i * tileSize);
          image.draw(graphics);
        } else {
          PositionedImage image = new PositionedImage("assets/wall.png", j * tileSize, i * tileSize);
          image.draw(graphics);
        }
      }
    }
  }
}
