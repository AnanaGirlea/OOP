package lab2.task1;

public class Complex {

    private int real;
    private int imaginary;

    public Complex (int r, int i){
        this.real = r;
        this.imaginary = i;
    }

    public Complex (){
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex (Complex nr){
        this.real = nr.real;
        this.imaginary = nr.imaginary;
    }

    public void AddWithComplex (Complex sum){
        sum.real = sum.real + this.real;
        sum.imaginary = sum.imaginary + this.imaginary;
    }

    public void ShowNumber(){
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Complex number: " +
                "real=" + real +
                ", imaginary=" + imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

}
