package Patterns.Observer.PullModel;

class TemperatureDisplay implements Observer, DisplayElement {
    private String name;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData weatherData;

    TemperatureDisplay(String name, WeatherData weatherData){
        this.name = name;
        this.weatherData = weatherData;
    }
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("====Printing PULLED weather Data for "+ this.name+"====");
        System.out.println("Temperature value: " + this.temperature);
        System.out.println("Humidity value: " + this.humidity);
        System.out.println("Pressure value: " + this.pressure);
    }
}
