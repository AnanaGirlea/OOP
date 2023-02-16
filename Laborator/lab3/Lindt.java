package Lab3;

import java.util.Objects;

public class Lindt extends CandyBox{
    private float length;
    private float width;
    private float height;

    public Lindt(){}

    public Lindt(String flavor, String origin,float length, float width, float height){
        super(flavor,origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    float getVolume(){
        return length*width*height;
    }

    @Override
    public String toString() {
        return "\n Lindt: " +
                "the  " + super.getOrigin() +
                " " + super.getFlavor() +
                " has volume " + this.getVolume();
    }

    public void printLindtDim(){
        System.out.println("Lindt: length = " + this.length +
                            " width = " + this.width +
                            " height = " + this.height);
    }

    @Override
    public void print() {
        System.out.println("Lindt: length = " + this.length
                + " width = " + this.width
                + " height = " + this.height);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
