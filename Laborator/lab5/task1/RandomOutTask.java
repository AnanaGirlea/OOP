package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task{

    @Override
    public void execute() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        System.out.println("Random Integer: "+rand_int1);
    }
}
