package ru.muhamedshin.RealBook.OBSERVER;

import ru.muhamedshin.RealBook.OBSERVER.interfaces.DisplayElement;
import ru.muhamedshin.RealBook.OBSERVER.interfaces.Observer;
import ru.muhamedshin.RealBook.OBSERVER.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity  + " % humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
    }
}
