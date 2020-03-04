package Observer.HeadFirst;

class StatisticsDisplay implements DisplayElement, Observer {
    Subject weatherData;
    float humidity;
    float temperature;
    float pressure;
    int measurements;

    StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        humidity = 65;
        temperature = 25;
        pressure = 1100;
        measurements = 100;
    }

    @Override
    public void display() {
        System.out.println("Avg temp/humidity/pressure  " + temperature + " / " + humidity + " / " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = (this.humidity * measurements + humidity) / (measurements + 1);
        this.temperature = (this.temperature * measurements + temp) / (measurements + 1);
        this.pressure = (this.pressure * measurements + pressure) / (measurements + 1);
        measurements += 1;
        display();
    }
}
