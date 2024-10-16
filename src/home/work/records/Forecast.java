package home.work.records;

public record Forecast(String date, int date_ts, int week, String sunrise, String sunset, String rise_begin,
                       String set_end, int moon_code, String moon_text, Parts parts, Hour[] hours, Biomet biomet) {
    public double getAverageTemperature() {
        return this.parts().getAverageTemperature();
    }
}
