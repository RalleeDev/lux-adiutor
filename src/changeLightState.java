import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class changeLightState {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.open-meteo.com/v1/forecast?latitude=56.1567&longitude=10.2108&hourly=temperature_2m,visibility&timezone=Europe%2FBerlin&forecast_days=1"))
            .build();
        System.out.println("status code: " + response.statusCode());
        System.out.println("headers: " + response.headers());
        System.out.println("response body: " + response.body());
    }
}