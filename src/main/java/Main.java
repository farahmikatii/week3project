import okhttp3.*;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.edamam.com/api/recipes/v2?app_id=0e94da52&app_key=%20a1c655a3813bf3c3fc6362ee953aa8e3&type=public&mealType=Dinner")
                .get()
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response);
    }
}