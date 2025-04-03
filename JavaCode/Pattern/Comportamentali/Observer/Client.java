package Observer;

import Observer.observer.*;
import Observer.subject.*;


/* Client */
public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.attach(currentConditionsDisplay);
        weatherStation.attach(statisticsDisplay);

        // Simulate a change in temperature
        weatherStation.setTemperature(25.5f);
        // Output:
        // Current Conditions Display: Temperature = 25.5
        // Statistics Display: Temperature = 25.5

        // Simulate another change in temperature
        weatherStation.setTemperature(30.0f);
        // Output:
        // Current Conditions Display: Temperature = 30.0
        // Statistics Display: Temperature = 30.0

        // Remove an observer
        weatherStation.detach(currentConditionsDisplay);

        // Simulate another change in temperature
        weatherStation.setTemperature(28.0f);
        // Output:
        // Statistics Display: Temperature = 28.0
    }

}
