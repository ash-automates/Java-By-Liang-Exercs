public class WeatherStation {
    private double temperature;
    private double pressure;

    public WeatherStation(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public WeatherStation() {
        this(0, 1);
    }

    public static WeatherStation fromImperial(double tempInF, double pressureInPSI) {
        double tempInC = (tempInF - 32) * 5 / 9;
        double pressureInBar = pressureInPSI * 0.0689476;
        return new WeatherStation(tempInC, pressureInBar);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getTemperatureFahrenheit() {
        return (temperature * 9.0 / 5.0) + 32;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setTemperatureFahrenheit(double tempInF) {
        this.temperature = (tempInF - 32) * 5 / 9;
    }

    public double getPressure() {
        return pressure;
    }

    public double getPressurePSI() {
        return pressure / 0.0689476;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setPressurePSI(double pressureInPSI) {
        this.pressure = pressureInPSI * 0.0689476;
    }
}
