package lab2.task3;

public class Polygon {

    private int n;
    private Point[] points;

    public Polygon(int n) {
        this.points = new Point[n];
        this.n = n;
        for(int i=0;i<n;i++){
            points[i] = new Point(0,0);
        }
    }

    public Polygon(float[] array){
        this(array.length/2);
        int k;
        k=0;
        for(int i=0;i<array.length-1;i+=2){
            this.points[k++].changeCoords(array[i], array[i+1]);

        }
    }

    public int getN() {
        return n;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
}
