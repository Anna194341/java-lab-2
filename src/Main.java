import RailwayStation.Car;
import RailwayStation.Locomotive;
import RailwayStation.Train;
import CarTypes.BusinessClassCar;
import CarTypes.EconomyClassCar;
import CarTypes.SleeperCar;

public class Main {
    public static void main(String[] args) {
        try {
            Locomotive locomotive = new Locomotive(1, 20000);
            Train train = new Train(locomotive);

            train.addCar(new EconomyClassCar(101));
            train.addCar(new SleeperCar(102));
            train.addCar(new BusinessClassCar(103));

            System.out.println("Загальна вантажопідйомність потягу: " + train.totalLoadCapacity() + " кг");

            int[] totals = train.totalPassengersAndBaggage();
            System.out.println("Загальна кількість пасажирів: " + totals[0] + ", Загальна кількість багажу: " + totals[1]);

            train.sortByComfortLevel();
            System.out.println("Вагони після сортування за комфортністю:");
            System.out.println(train);

            int minPassengers = 30, maxPassengers = 100;
            var carsInRange = train.findCarByPassengerRange(minPassengers, maxPassengers);
            System.out.println("Вагони з кількістю пасажирів у діапазоні " + minPassengers + "-" + maxPassengers + ":");
            for (Car car : carsInRange) {
                System.out.println(car.getFormattedNumber());
            }
        } catch (Exception e) {
            System.err.println("Сталася помилка: " + e.getMessage());
        }
    }
}
