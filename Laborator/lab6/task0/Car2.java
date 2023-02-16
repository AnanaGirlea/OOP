package lab6.task0;

interface Engine {
    public int getFuelCapacity();
}

public class Car2 {
    public Engine getEngine(int fuelCapacity) {
        return new Engine () {
            private int fuelCapacity = 11;

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        };
    }
}
