import java.lang.reflect.Array;
import java.util.Arrays;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

  LatLngHandler location = new LatLngHandler();

  public void handleArgs(String[] args) {
    if (args.length == 0) {
      Controller.printUsage();
    }

    OptionSet options = getOptionSetFromParser(args);

    if (options.has("c")) {
      System.out.println(getFirstCountryWeatherInfo(args));
    }

    if (options.has("c") && options.has("compare")) {
      System.out.println(getSecondCountryWeatherInfo(args));
      System.out.println("Weather Difference is: " + ArgumentHandler.compare(getFirstCountryWeatherInfo(args), getSecondCountryWeatherInfo(args)) + " c");
    }
  }

  private static int compare(String firstCountryWeatherInfo, String secondCountryWeatherInfo) {
    String[] splitCountryWeatherInfo1 = firstCountryWeatherInfo.split(" ");
    String[] splitCountryWeatherInfo2 = secondCountryWeatherInfo.split(" ");
    int firstCelsious = Integer.parseInt(splitCountryWeatherInfo1[0]);
    int secondCelsious = Integer.parseInt(splitCountryWeatherInfo2[0]);
    return firstCelsious > secondCelsious ? firstCelsious - secondCelsious : secondCelsious - firstCelsious;
  }


  String getFirstCountryWeatherInfo(String[] args) {
    LatitudeLongitudeDots coordinates = location.getDots(getOptionSetFromParser(args).valueOf("c").toString());
    return Controller.printWeatherAtLocation(Controller.createWeatherService(), coordinates.getLatitude(), coordinates.getLongitude());
  }

  String getSecondCountryWeatherInfo(String[] args) {
    LatitudeLongitudeDots coordinates = location.getDots(getOptionSetFromParser(args).valueOf("compare").toString());
    return Controller.printWeatherAtLocation(Controller.createWeatherService(), coordinates.getLatitude(), coordinates.getLongitude());
  }

  private static OptionSet getOptionSetFromParser(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("c").withRequiredArg();
    parser.accepts("compare").withRequiredArg();
    return parser.parse(args);
  }

}
