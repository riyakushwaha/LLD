package Patterns.Observer.PullModel;

class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureDisplay phoneDisplay = new TemperatureDisplay("Phone", weatherData);
        TemperatureDisplay laptopDisplay = new TemperatureDisplay("Laptop", weatherData);

        weatherData.registerObserver(phoneDisplay);
        weatherData.registerObserver(laptopDisplay);

        weatherData.setMeasurements(12, 24.90F, 36.78F);
        weatherData.setMeasurements(100, 234.90F, 396.78F);

        weatherData.removeObserver(phoneDisplay);

        weatherData.setMeasurements(-0, -4.90F, -6.78F);
    }
}
