public class Main {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();

        Car electricCar = new ElectricCar("Tesla Model S");
        Car gasolineCar = new GasolineCar("Toyota Camry");

        carManager.registerObserver(new CarOwner("Aidos"));
        carManager.registerObserver(new CarOwner("Marat"));

        carManager.refuelCar(electricCar);
        carManager.driveCar(gasolineCar);
    }
}
