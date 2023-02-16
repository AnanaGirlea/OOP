package lab5.task1;

public class CounterOutTask implements Task{
    static int k;

    public CounterOutTask(){}

    public CounterOutTask(int k){
        this.k =k;
    }

    @Override
    public void execute() {
        k++;
        System.out.println(this.k);
    }
}
