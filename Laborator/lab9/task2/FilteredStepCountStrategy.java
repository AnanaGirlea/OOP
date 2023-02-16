package lab9.task2;

import lab9.dataprocessing.StepCountStrategy;
import lab9.storage.SensorData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy {
    List<SensorData> sensor = new ArrayList<>();
    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(60);

    @Override
    public int getTotalSteps() {
        int s = 0;
        for(int i = 0; i < sensor.size(); i++){
            if((0 < sensor.get(i).getStepsCount())) {
                if ((sensor.get(i).getTimestamp() < TIME_FOR_MAX_DIFF) && (sensor.get(i).getStepsCount() > MAX_DIFF_STEPS_CONSECUTIVE_RECORDS)) {
                    break;
                } else{
                    s = s + sensor.get(i).getStepsCount();
                }
            }
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
