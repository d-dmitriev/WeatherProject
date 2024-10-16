package home.work.records;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public record Weather(int now, String now_dt, Info info, Fact fact, Forecast[] forecasts) {
    public double getTemperature() {
        return fact().temp();
    }

    public double getAverageTemperature() {
        return Arrays
                .stream(this.forecasts())
                .map(Forecast::getAverageTemperature).mapToDouble(x -> x).average().orElseThrow();
    }

    public static Weather buildWeatherFromJson(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Weather.class);
    }
}
