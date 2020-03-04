package Observer.HeadFirst;

class ForecastDisplay implements DisplayElement, Observer {
    Subject weatherData;
    float temperature;
    float humidity;
    float pressure;


    ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (temperature < 20 && humidity > 75) {
            System.out.println("Forecast: rain");
        } else if (temperature > 30 && humidity < 40) {
            System.out.println("Forecast: sunny");
        } else if (pressure > 1300) {
            System.out.println("Forecast: windy");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }
}
