package home.work.records;

public record Info(boolean n, String url, float lat, float lon, TimeZone tzinfo, int def_pressure_mm,
                   int def_pressure_pa, int zoom, boolean nr, boolean ns, boolean nsr, boolean p, boolean f,
                   boolean _h) {
}
