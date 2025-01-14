//package Patterns.Adapter.Example2;
//
//public class TemperatureSensorAdapter implements TemperatureSensor {
//    private LegacyTemperatureSensor legacySensor;
//
//    public TemperatureSensorAdapter(LegacyTemperatureSensor legacySensor) {
//        this.legacySensor = legacySensor;
//    }
//
//    @Override
//    public double getTemperatureInCelsius() {
//        double tempInFahrenheit = legacySensor.getTemperatureInFahrenheit();
//        return convertFahrenheitToCelsius(tempInFahrenheit);
//    }
//
//    private double convertFahrenheitToCelsius(double fahrenheit) {
//        return (fahrenheit - 32) * 5.0 / 9.0;
//    }
//}
