package Patterns.Observer.PushModel;

import java.util.ArrayList;
import java.util.List;

class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;

    private float pressure;


    WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
