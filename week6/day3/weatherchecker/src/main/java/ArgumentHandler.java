import java.lang.reflect.Array;
import java.util.List;

public class ArgumentHandler {

  private String usageInfo = "src/main/resources/usage.txt";

  public void noArgument(String[] args) {
    if (args.length == 0) {
      FileHandler.linePrinter(FileHandler.fileReader(usageInfo));
    }
  }

  public void checkWeatherInCountry(String givenArgs) {
    String countryCode = givenArgs.toUpperCase();
    String[] countryElement = getCountryData(countryCode);
  }


  public String[] getCountryData(String countryCode) {
    List<String[]> dataList = FileHandler.fileReader(FileHandler.getFilePath());
    String[] returnArray = new String[dataList.get(0).length];
    for (String[] dataElements : dataList) {
      if (countryCode.equals(dataElements[0])) {
        returnArray = dataElements;
      }
    }
    return returnArray;
  }
}


