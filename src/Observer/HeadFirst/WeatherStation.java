package Observer.HeadFirst;

class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(15, 80, 1500);
        weatherData.setMeasurements(35, 30, 1200);
        weatherData.setMeasurements(30, 40, 1400);
    }
}
