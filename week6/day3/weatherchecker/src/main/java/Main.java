import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Main {

  public static void main(String[] args) {
    ArgumentHandler argumentHandler = new ArgumentHandler();
    argumentHandler.handleArgs(args);
  }
}
