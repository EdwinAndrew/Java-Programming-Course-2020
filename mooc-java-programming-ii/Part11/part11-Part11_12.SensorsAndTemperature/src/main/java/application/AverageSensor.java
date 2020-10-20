package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
       return this.sensors.stream().noneMatch((sensor -> (!sensor.isOn())));
    }

    @Override
    public void setOn() {
       sensors.forEach((sensor-> sensor.setOn()));
    }

    @Override
    public void setOff() {
        sensors.forEach((sensor -> sensor.setOff()));
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()){
            throw new IllegalArgumentException("Average sensor cannot measure while off.");
        }
        int sum = 0;
        sum = sensors.stream().map(sensor -> sensor.read())
                .reduce(sum,Integer::sum);
        int avg = sum / sensors.size();
        readings.add(avg);
        return avg;
    }
    public List<Integer> readings() {
        return readings;
    }
}
