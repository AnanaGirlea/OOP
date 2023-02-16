package lab9.storage;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable - DONE
    private List<SensorData> list = new ArrayList<>();

    public void addData(SensorData dataRecord){
        // TODO - DONE
        list.add(dataRecord);
        setChanged();
        notifyObservers();
    }

    // TODO implement a method to get the stored data (needed by the strategies) - DONE

    public List<SensorData> getList() {
        return list;
    }

    public void setList(List<SensorData> list) {
        this.list = list;
    }
}


