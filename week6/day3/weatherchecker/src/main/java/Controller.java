import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Controller {

  private static final String USAGE_FILE_PATH = "src/main/resources/usageInfo.csv";

  static WeatherChecker createWeatherService() {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://simple-weather.p.mashape.com/")
            .build();
    return retrofit.create(WeatherChecker.class);
  }

  static String getWeatherAtLocation(WeatherChecker weatherChecker, String latitude, String longitude) {
    Call<ResponseBody> weatherQuery = weatherChecker.setQueryCoordinates(latitude, longitude);
    String returnString = "";
    try {
      returnString = weatherQuery.execute().body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return returnString;
  }

  static void printUsage() {
    for (String[] fileElements : FileHandler.fileReader(USAGE_FILE_PATH)) {
      for (int i = 0; i < fileElements.length; i++) {
        System.out.print(fileElements[i] + " ");
      }
      System.out.println();
    }
  }
}

