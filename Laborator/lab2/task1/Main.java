package lab2.task1;

public class Main {
    public static void main(String[] args){

        Complex nr1 = new Complex();
        Complex nr2 = new Complex();

        nr1.setReal(2);
        nr1.setImaginary(1);

        nr2.setReal(6);
        nr2.setImaginary(3);

        nr1.AddWithComplex(nr2);
        nr2.ShowNumber();
    }
}
