package RailwayStation;

public class Locomotive extends RailwayVehicle {

    private double power;

    public Locomotive(int number, double power) {
        super(number,0.0);
        this.power = power;
    }

    @Override
    public String getFormattedNumber() {
        return "L" + number;
    }

}
