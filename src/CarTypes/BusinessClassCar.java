package CarTypes;

import RailwayStation.Car;

public class BusinessClassCar extends Car {
    public BusinessClassCar(int number) {
        super(number, 20, 35, 1);
    }

    @Override
    public double calculateWeightCapacity() {
        return super.calculateWeightCapacity();
    }

    @Override
    public String getFormattedNumber() {
        return "B" + number;
    }
}
