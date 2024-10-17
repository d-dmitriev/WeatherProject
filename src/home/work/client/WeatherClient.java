package home.work.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherClient {
    private static final String API_URL = "https://api.weather.yandex.ru/v2/forecast?lat=%s&lon=%s&limit=%s";
    private static final String HEADER_NAME = "X-Yandex-Weather-Key";

    public static String getWeatherData(String apiKey, double lat, double lon, int limit) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL.formatted(lat, lon, limit)))
                .GET()
                .header(HEADER_NAME, apiKey)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) throw new Exception("Ошибка получения данных");

        return response.body();
    }
}
