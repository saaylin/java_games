package at.aylin.games.test1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 5);
        Train train = new Train("S1", 1);
        AeroCar AeroCar = new AeroCar("Mercedes", 2);

        CarDealer dealer = new CarDealer();

        dealer.addVehicle(car);
        dealer.addVehicle(train);
        dealer.addVehicle(AeroCar);

        car.drive();
        train.drive();
        AeroCar.drive();

        dealer.printVehicles();
    }
}