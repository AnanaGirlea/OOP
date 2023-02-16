package lab11.task2;

public class MyVector3 implements Summable{
    private int x;
    private int y;
    private int z;

    public MyVector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MyVector3(){

    }

    @Override
    public void addValue(Summable value) {
        x = x + ((MyVector3) value).getX();
        y = y + ((MyVector3) value).getY();
        z = z + ((MyVector3) value).getZ();
    }

    @Override
    public int total() {
        int total = 0;
        total = x + y + z;
        return total;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "MyVector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
