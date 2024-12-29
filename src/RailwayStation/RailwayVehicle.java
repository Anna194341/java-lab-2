package RailwayStation;

public abstract class RailwayVehicle {

    protected int number;
    protected double weightCapacity;

    public RailwayVehicle(int number, double weightCapacity) {
        this.number = number;
        this.weightCapacity = weightCapacity;
    }

    public abstract String getFormattedNumber();
}
