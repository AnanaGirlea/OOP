package lab2.task3;

public class Main {

    public static void main(String[] args){

        float array[] = {1,2,3,4,5,6};
        Polygon poly= new Polygon(array);

        System.out.println("Polygon: ");
        for(int i=0;i<array.length/2;i++) {
            System.out.println(poly.getPoints()[i].toString());
        }
    }
}
