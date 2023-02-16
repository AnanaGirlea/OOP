package lab9.task1;

import lab9.communication.ServerMessage;
import lab9.main.Utils;
import lab9.storage.DataRepository;
import lab9.storage.SensorData;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        for(int i = 0; i < ((DataRepository) o).getList().size(); i++){
            SensorData sensor = ((DataRepository) o).getList().get(i);
            ServerMessage mes = new ServerMessage(sensor.getStepsCount(), Utils.getClientId(), sensor.getTimestamp());
            System.out.println(mes);
        }
    }
}
