package lab9.task1;

import lab9.storage.DataRepository;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        for( int i = 0; i < ((DataRepository) o).getList().size() ; i++){
            System.out.println(((DataRepository) o).getList().get(i));
        }
    }
}
