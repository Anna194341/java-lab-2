package CarTypes;

import RailwayStation.Car;

public class EconomyClassCar extends Car {
    public EconomyClassCar(int number) {
        super(number, 120, 5, 3);
    }

    @Override
    public String getFormattedNumber() {
        return "Е" + number;
    }
}
