package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensorState;

    @Override
    public boolean isOn() {
        return this.sensorState;
    }

    @Override
    public void setOn() {
        this.sensorState = true;
    }

    @Override
    public void setOff() {
        this.sensorState = false;
    }

    @Override
    public int read() {
        Random random = new Random();
        if (isOn()) {
            return random.nextInt(61)-30;
        } else {
            throw new IllegalStateException();
        }
    }

}
