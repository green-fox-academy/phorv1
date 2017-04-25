import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Main {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://yoda.p.mashape.com/")
            .build();

    YodaService service = retrofit.create(YodaService.class);

    Call<ResponseBody> respons = service.getLine("You will learn how to speak like me some day!");

    try {
      System.out.println(respons.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
