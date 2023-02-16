package lab9.task2;

import lab9.dataprocessing.StepCountStrategy;
import lab9.storage.SensorData;

import java.util.ArrayList;
import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {
    private List<SensorData> sensor = new ArrayList<>();

    @Override
    public int getTotalSteps() {
        int s = 0;
        for(int i = 0; i < sensor.size(); i++){
            s = s + sensor.get(i).getStepsCount();
        }
        return s;
    }

    @Override
    public String getStrategyDescription() {
        return null;
    }

    public List<SensorData> getSensor() {
        return sensor;
    }

    public void setSensor(List<SensorData> sensor) {
        this.sensor = sensor;
    }
}
