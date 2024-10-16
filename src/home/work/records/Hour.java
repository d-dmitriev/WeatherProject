package home.work.records;

public record Hour(String hour, int hour_ts, int cloudness, String condition, int feels_like, int humidity, String icon,
                   int prec_mm, int prec_period, int prec_prob, int prec_strength, int prec_type, int pressure_mm,
                   int pressure_pa, int temp, int uv_index, int temp_water, int wind_angle, String wind_dir,
                   float wind_gust, float wind_speed) {
}
