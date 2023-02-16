package lab9.main;

import lab9.dataprocessing.StepCountStrategy;
import lab9.storage.DataRepository;
import lab9.storage.SensorData;
import lab9.task1.ConsoleLogger;
import lab9.task1.DataAggregator;
import lab9.task1.ServerCommunicationController;
import lab9.task3.StepCountStrategyFactory;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Choose a strategy: type 'basic or 'filtered");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository = new DataRepository();
        // TODO: use the StepCountStrategyFactory to create a strategy - DONE
        StepCountStrategy strategy = StepCountStrategyFactory.createStrategy(strategyType, dataRepository);

        // TODO: add observers to the dataRepository - DONE
        // don't forget to provide the strategy to the DataAggregator observer

        ConsoleLogger console = new ConsoleLogger();
        ServerCommunicationController server = new ServerCommunicationController();
        DataAggregator data = new DataAggregator(strategy);

        dataRepository.addObserver(console);
        dataRepository.addObserver(server);
        dataRepository.addObserver(data);

        data.getStrategy().setSensor(dataRepository.getList());

        // TODO: uncomment - DONE
        long baseTimestamp = System.currentTimeMillis();

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();

        // TODO: after the first successful run, change this to baseTimestamp + 40000 and check the result
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();
    }
}
