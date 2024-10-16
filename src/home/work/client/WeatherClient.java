package home.work.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherClient {
    private static final String API_URL = "https://api.weather.yandex.ru/v2/forecast";
    private static final String HEADER_NAME = "X-Yandex-Weather-Key";

    public static String getWeatherData(String apiKey, String lat, String lon, String limit) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL.concat("?lat=").concat(lat).concat("&lon=").concat(lon).concat("&limit=").concat(limit)))
                .GET()
                .header(HEADER_NAME, apiKey)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) throw new Exception("Ошибка получения данных");

        return response.body();
    }
}
