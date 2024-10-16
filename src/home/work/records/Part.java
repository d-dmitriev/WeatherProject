package home.work.records;

public record Part(String daytime, String _source, Biomet biomet, int cloudness, String condition,
                   int fresh_snow_mm, int humidity, String icon, boolean polar, int prec_mm, int prec_period,
                   int prec_prob, int prec_strength, int prec_type, int pressure_mm, int pressure_pa, int temp,
                   float temp_avg,
                   int temp_max, int temp_min, int temp_water, int feels_like, int uv_index, int wind_angle,
                   String wind_dir, float wind_gust, float wind_speed) {
}
