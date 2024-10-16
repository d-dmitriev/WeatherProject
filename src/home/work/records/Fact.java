package home.work.records;

public record Fact(String daytime, int obs_time, String season, String source, int uptime, float cloudness,
                   String condition, int feels_like, int humidity, String icon, boolean is_thunder, boolean polar,
                   int prec_prob, int prec_strength, int prec_type, int pressure_mm, int pressure_pa,
                   float temp, int uv_index, int temp_water, int wind_angle, String wind_dir, float wind_gust,
                   int wind_speed) {
}
