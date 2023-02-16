package Lab3;

import java.util.Objects;

public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor(){}

    public ChocAmor(String flavor, String origin,float length){
        super(flavor,origin);
        this.length = length;
    }

    float getVolume(){
        return length*length*length;
    }

    @Override
    public String toString() {
        return "\n ChocAmor: " +
                "the  " + super.getOrigin() +
                " " + super.getFlavor() +
                " has volume " + this.getVolume();
    }

    public void printChoAmorDim(){
        System.out.println("ChocAmor: length = " + this.length);
    }

    @Override
    public void print() {
        System.out.println("ChocoAmor: length = " + this.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength());
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
