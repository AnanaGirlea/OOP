package lab10.builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Bucureti", 8, "da", 40)
                .electrocasnice(1)
                .piscina(0)
                .panouriSolare(1)
                .securitate(1)
                .build();
        System.out.println(house);
    }
}
