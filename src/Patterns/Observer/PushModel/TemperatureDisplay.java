package Patterns.Observer.PushModel;

class TemperatureDisplay implements  Observer, DisplayElement{
    private String name;
    private float temperature;
    private float humidity;
    private float pressure;

    TemperatureDisplay(String name){
        this.name = name;
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("====Printing PUSHED weather Data for "+ this.name+"====");
        System.out.println("Temperature value: " + this.temperature);
        System.out.println("Humidity value: " + this.humidity);
        System.out.println("Pressure value: " + this.pressure);
    }
}
