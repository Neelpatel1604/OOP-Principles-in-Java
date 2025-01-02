package Polymorphism.WeatherStation;

import java.util.Random;

public class WindGuageSimulator implements WindMeasurementDevice {

    public WindData getWindData()
    {
        Random rnd = new Random();
        WindData windInfo = new WindData(rnd.nextInt(50), rnd.nextInt(360));
        return windInfo;
    }
}
