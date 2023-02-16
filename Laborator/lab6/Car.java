package lab6;

public class Car {
    private int pret;
    private int an_fabric;
    private CarType type;

    enum CarType{
        Honda,
        BMW,
        Hyundai
    }

    public Car(int pret, int an_fabric, CarType type) {
        this.pret = pret;
        this.an_fabric = an_fabric;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pret=" + pret +
                ", an_fabric=" + an_fabric +
                ", type=" + type +
                '}';
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getAn_fabric() {
        return an_fabric;
    }

    public void setAn_fabric(int an_fabric) {
        this.an_fabric = an_fabric;
    }
}
