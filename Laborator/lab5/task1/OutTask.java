package lab5.task1;

public class OutTask implements Task{
    public String c;

    public OutTask(String c){
        this.c = c;
    }

    @Override
    public void execute() {
        System.out.println(this.c);
    }
}
