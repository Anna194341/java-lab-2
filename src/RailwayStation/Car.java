package RailwayStation;

public abstract class Car extends RailwayVehicle {
    protected int maxPassengers;
    protected double maxBaggagePerPerson;
    protected int comfortLevel;


    public Car(int number, int maxPassengers, double maxBaggagePerPerson, int comfortLevel) {
        super(number, 0);
        this.maxPassengers = maxPassengers;
        this.maxBaggagePerPerson = maxBaggagePerPerson;
        this.comfortLevel = comfortLevel;
        this.weightCapacity = calculateWeightCapacity();
    }

    public double calculateWeightCapacity() {
        return maxPassengers * (100 + maxBaggagePerPerson);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", maxPassengers=" + maxPassengers +
                ", maxBaggagePerPerson=" + maxBaggagePerPerson +
                ", weightCapacity=" + weightCapacity +
                '}';
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public double getMaxBaggagePerPerson() {
        return maxBaggagePerPerson;
    }
}
