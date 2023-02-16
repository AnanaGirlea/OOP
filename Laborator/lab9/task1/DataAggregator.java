package lab9.task1;

import lab9.communication.ServerMessage;
import lab9.dataprocessing.StepCountStrategy;
import lab9.main.Utils;
import lab9.storage.DataRepository;
import lab9.storage.SensorData;
import lab9.task2.BasicStepCountStrategy;
import lab9.task2.FilteredStepCountStrategy;

import java.util.Observable;
import java.util.Observer;

public class DataAggregator implements Observer {
    private StepCountStrategy strategy;

    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(strategy.getTotalSteps());

//        for(int i = 0; i < ((DataRepository) o).getList().size(); i++){
//            SensorData sensor = ((DataRepository) o).getList().get(i);
//            if(sensor.equals(Utils.BASIC_STRATEGY)){
//                BasicStepCountStrategy basicStrategy = new BasicStepCountStrategy();
//                System.out.println(basicStrategy);
//            } else{
//                FilteredStepCountStrategy filteredStrategy = new FilteredStepCountStrategy();
//                System.out.println(filteredStrategy);
//            }
//        }
    }

    public StepCountStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(StepCountStrategy strategy) {
        this.strategy = strategy;
    }
}
