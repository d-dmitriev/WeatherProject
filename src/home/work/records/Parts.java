package home.work.records;

public record Parts(Part day, Part day_short, Part evening, Part morning, Part night, Part night_short) {
    public double getAverageTemperature() {
        return (this.day().temp_avg() + this.night().temp_avg() + this.morning().temp_avg() + this.evening().temp_avg()) / 4;
    }
}
