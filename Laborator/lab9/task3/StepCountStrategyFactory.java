package lab9.task3;

import lab9.communication.ServerMessage;
import lab9.dataprocessing.StepCountStrategy;
import lab9.main.Utils;
import lab9.storage.DataRepository;
import lab9.storage.SensorData;
import lab9.task2.BasicStepCountStrategy;
import lab9.task2.FilteredStepCountStrategy;

public class StepCountStrategyFactory {
    private String strategyType;
    private DataRepository dataRepository;

    public StepCountStrategyFactory(String strategyType, DataRepository dataRepository) {
        this.strategyType = strategyType;
        this.dataRepository = dataRepository;
    }

    public static StepCountStrategy createStrategy(String strategyType, DataRepository dataRepository) {
        switch(strategyType) {
            case Utils.BASIC_STRATEGY:
                return new BasicStepCountStrategy();
            case Utils.FILTERED_STRATEGY:
                return new FilteredStepCountStrategy();
        }
        throw new IllegalArgumentException("The strategy " + strategyType + " is not recognised");
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType;
    }

    public DataRepository getDataRepository() {
        return dataRepository;
    }

    public void setDataRepository(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
}
