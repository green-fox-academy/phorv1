import java.util.Arrays;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  public static void main(String[] args) {
    ArgumentHandler weatherChecker = new ArgumentHandler();

    weatherChecker.noArgument(args);

    OptionParser parser = new OptionParser();
    parser.accepts("c").withRequiredArg();

    OptionSet options = parser.parse(args);

    if (options.has("c")) {
      weatherChecker.checkWeatherInCountry(options.valueOf("c").toString());
    }

  }
}
