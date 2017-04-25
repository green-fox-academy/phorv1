import java.util.Arrays;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import retrofit2.Retrofit;

public class Main {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://simple-weather.p.mashape.com/")
            .build();

    WeatherChecker service = retrofit.create(WeatherChecker.class);


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
