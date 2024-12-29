package CarTypes;

import RailwayStation.Car;

public class SleeperCar extends Car {
    public SleeperCar(int number) {
        super(number, 60, 15, 2);
    }

    @Override
    public String getFormattedNumber() {
        return "S" + number;
    }
}
