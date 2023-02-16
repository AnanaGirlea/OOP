package lab6;

import lab6.Dealership;
import lab6.Offer;
import lab6.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        ArrayList<Car> list = new ArrayList<Car>();
        list.add(new Car(6800, 2008, Car.CarType.Honda));
        list.add(new Car(12200, 2012, Car.CarType.BMW));
        list.add(new Car(20100, 2018, Car.CarType.Hyundai));

        int i;
        for(i=0;i<3;i++) {
            System.out.println("\nInitial price:");
            System.out.println(list.get(i).getPret());

            System.out.println("Applying Brand discount:");
            System.out.println(dealership.new BrandOffer().getDiscount(list.get(i)));

            System.out.println("Applying Dealer discount:");
            System.out.println(dealership.new DealerOffer().getDiscount(list.get(i)));

            System.out.println("Applying Special discount:");
            dealership.setOffer3(dealership.new SpecialOffer().getDiscount(list.get(i)));
            System.out.println(dealership.getOffer3());

            System.out.println("Final price:");
            dealership.getFinalPrice(list.get(i));
            System.out.println(list.get(i).getPret());
            int copie = list.get(i).getPret();

            System.out.println("Applying Client discount:");

            dealership.negotiate(list.get(i), new Offer() {
                @Override
                public int getDiscount(Car car) {
                    return 200;
                }
            });

            System.out.println(copie - list.get(i).getPret());

            System.out.println("Final price after negotiation:");
            System.out.println(list.get(i).getPret());
        }
        list.removeIf(car -> car.getPret() <= 10000);
        System.out.println(list.toString());
    }
}
