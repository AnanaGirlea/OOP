package lab5.task3;

public class Operation {
    float number;

    public Operation(float number) {
        this.number = number;
    }

    public void minus(float nr){
        number= number - nr;
    }
    public void plus(float nr){
        number= number + nr;
    }
    public void mult(float nr){
        number= number * nr;
    }
    public void div(float nr){
        if(nr>1)
            number= number / nr;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }
}
