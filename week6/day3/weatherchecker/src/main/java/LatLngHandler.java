import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class LatLngHandler extends ArrayList<String[]>{

  private static final String COORDINATE_CSV_FILE = "src/main/resources/data.csv";
  private String fileName;


  public LatLngHandler() {
    this.fileName = COORDINATE_CSV_FILE;
    readDataFile();
  }

  void readDataFile() {
    List<String[]> fileDatabase = FileHandler.fileReader(COORDINATE_CSV_FILE);
    this.addAll(fileDatabase);
  }

  LatitudeLongitudeDots getDots(String countryCode) {
    for (String[] geoEntity : this) {
      if (geoEntity[0].equalsIgnoreCase(countryCode)) {
        String latitude = geoEntity[1];
        String longitude = geoEntity[2];
        return new LatitudeLongitudeDots(latitude, longitude);
      }
    }
    return null;
  }
}

