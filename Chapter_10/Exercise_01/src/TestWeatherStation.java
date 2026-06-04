public class TestWeatherStation {

    public static void main(String[] args) {

        // 1. Create the three objects specified in the prompt
        WeatherStation station1 = new WeatherStation();
        WeatherStation station2 = new WeatherStation(35, 0.5);
        WeatherStation station3 = WeatherStation.fromImperial(68, 21);

        // 2. Display their data in both metric and imperial units
        System.out.println("--- Station 1 (No-arg constructor) ---");
        displayStationData(station1);

        System.out.println("\n--- Station 2 (Parameterized constructor: 35C, 0.5 bar) ---");
        displayStationData(station2);

        System.out.println("\n--- Station 3 (fromImperial static method: 68F, 21 PSI) ---");
        displayStationData(station3);
    }

    // Helper method to keep the main method clean and avoid writing the print statements three times
    private static void displayStationData(WeatherStation station) {
        System.out.printf("Metric   : %.2f °C | %.4f bar\n",
                station.getTemperature(), station.getPressure());
        System.out.printf("Imperial : %.2f °F | %.4f PSI\n",
                station.getTemperatureFahrenheit(), station.getPressurePSI());
    }
}
