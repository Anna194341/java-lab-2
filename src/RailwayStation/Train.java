package RailwayStation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Train {
    private final Locomotive locomotive;
    private final List<Car> cars;

    public Train(Locomotive locomotive) {
        if (locomotive == null) throw new IllegalArgumentException("Локомотив не може бути null!");
        this.locomotive = locomotive;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        if (car == null) throw new IllegalArgumentException("Вагон не може бути null!");
        cars.add(car);
    }

    public int[] totalPassengersAndBaggage() {
        int totalPassengers = cars.stream().mapToInt(Car::getMaxPassengers).sum();
        int totalBaggage = cars.stream().mapToInt(car -> car.getMaxPassengers() * (int) car.getMaxBaggagePerPerson()).sum();
        return new int[]{totalPassengers, totalBaggage};
    }

    public double totalLoadCapacity() {
        return cars.stream().mapToDouble(wagon -> wagon.weightCapacity).sum();
    }

    public void sortByComfortLevel() {
        cars.sort(Comparator.comparingInt(Car::getComfortLevel));
    }

    public List<Car> findCarByPassengerRange(int minPassengers, int maxPassengers) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxPassengers() >= minPassengers && car.getMaxPassengers() <= maxPassengers) {
                result.add(car);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Train{locomotive=").append(locomotive.getFormattedNumber()).append(", wagons=[");
        for (Car car : cars) {
            builder.append(car.getFormattedNumber()).append(", ");
        }
        if (!cars.isEmpty()) builder.setLength(builder.length() - 2);
        builder.append("]}");
        return builder.toString();
    }
}
