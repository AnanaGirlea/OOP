package Lab3;

import java.util.Objects;

public class Baravelli extends CandyBox{
    private float radius;
    private float height;

    public Baravelli(){}

    public Baravelli(String flavor, String origin,float radius, float height){
        super(flavor,origin);
        this.radius = radius;
        this.height = height;
    }

    float getVolume(){
        return radius*radius*height;
    }

    @Override
    public String toString() {
        return "\n Baravelli: " +
                "the  " + super.getOrigin() +
                " " + super.getFlavor() +
                " has volume " + this.getVolume();
    }

    public void printBaravelliDim(){
        System.out.println("Baravelli: radius = " + this.radius +
                            " height = " + this.height);
    }

    @Override
    public void print() {
        System.out.println("Baravelli: length = " + this.radius +
                            " height = " + this.height);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
