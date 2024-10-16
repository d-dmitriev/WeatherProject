package home.work;

import home.work.client.WeatherClient;
import home.work.records.Weather;
import home.work.ui.Console;

public class Main {
    private static final String API_KEY = "";


    public static void main(String[] args) throws Exception {
        String json = WeatherClient.getWeatherData(API_KEY, "55.75", "37.62", "10");

        Console.printText("Весь ответ сервиса", json);

        Weather weather = Weather.buildWeatherFromJson(json);

        Console.printNumber("Температура", weather.getTemperature());

        Console.printNumber("Средняя температура", weather.getAverageTemperature());
    }
}
