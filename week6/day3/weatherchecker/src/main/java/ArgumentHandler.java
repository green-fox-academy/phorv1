import java.lang.reflect.Array;
import java.util.List;

public class ArgumentHandler {

  String usageInfo = "src/main/resources/usage.txt";

  public void noArgument(String[] args) {
    if (args.length == 0) {
      FileHandler.linePrinter(FileHandler.fileReader(usageInfo));
    }
  }


  public void checkWeatherInCountry(String givenArgs) {

  }

  public String[] getCountryData(String countryCode) {
    List<String[]> dataList = FileHandler.fileReader(FileHandler.filePath);
    String[] returnArray = new String[dataList.get(0).length];
    for (String[] dataElements : dataList) {
      if (countryCode.equals(dataElements[0])) {
        returnArray = dataElements;
      }
    }
    return returnArray;
  }
}


