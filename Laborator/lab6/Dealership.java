package lab6;

import lab5.task1.Task;

import java.util.ArrayList;
import java.util.Random;

public class Dealership {
    private int offer3;

    class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            Car.CarType myVar = Car.CarType.Honda;
            switch (myVar) {
                case Honda:
                    return car.getPret() * 5 / 100;
                case BMW:
                    return car.getPret() * 10 / 100;
                case Hyundai:
                    return car.getPret() * 15 / 100;
            }
            return 0;
        }
    }

    class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            return 100 * (2021 - car.getAn_fabric());
        }
    }

    class SpecialOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            Random rand = new Random();
            int rand_int = rand.nextInt(0,300);
            return rand_int;
        }
    }

    public void getFinalPrice(Car car){
        int offer1 = new BrandOffer().getDiscount(car);
        int offer2 = new DealerOffer().getDiscount(car);
        car.setPret(car.getPret() - offer1 - offer2 - offer3);
    }

    public void negotiate(Car car, Offer offer) {
        Random rand = new Random();
        int rand_int = rand.nextInt(0, 2);
        if (rand_int == 1) {
            car.setPret(car.getPret() - offer.getDiscount(car));
        }
    }

    public int getOffer3() {
        return offer3;
    }

    public void setOffer3(int offer3) {
        this.offer3 = offer3;
    }
}
