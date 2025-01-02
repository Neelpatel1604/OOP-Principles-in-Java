package Polymorphism.WeatherStation;

public class WindData {
    private int windSpeed;
    private int windDirection;

    public WindData(int windSpeed, int windDirection) {
        if (windSpeed < 0 || windSpeed > 80) {
            throw new IllegalArgumentException("Invalid wind speed: " + windSpeed);
        }
        if (windDirection < 0 || windDirection >= 360) {
            throw new IllegalArgumentException("Invalid wind direction: " + windDirection);
        }
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public int getWindSpeed()
    {
        return windSpeed;
    }

    public int getWindDirection()
    {
        return windDirection;
    }

}