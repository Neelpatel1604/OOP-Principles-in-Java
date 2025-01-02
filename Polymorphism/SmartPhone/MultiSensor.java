package Polymorphism.SmartPhone;
import java.util.Random;

public class MultiSensor implements TemperatureSensor {

    @Override
    public int getTemperature()
    {
        return new Random().nextInt(100);
    }

}