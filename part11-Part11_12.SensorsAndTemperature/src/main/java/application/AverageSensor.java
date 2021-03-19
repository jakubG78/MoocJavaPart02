package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        boolean isOn = false;
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        if (this.isOn() && !sensors.isEmpty()) {
            for (Sensor sensor : sensors) {
                sum += sensor.read();
            }
            int average = sum / sensors.size();
            readings.add(average);
            return average;

        } else {
            throw new IllegalStateException();

        }
    }

    public List<Integer> readings() {
        return readings;
    }
}
