import java.util.ArrayList;
import java.util.List;

public class CarManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void refuelCar(Car car) {
        car.refuel();
        notifyObservers(car.getDescription() + " has been refueled.");
    }

    public void driveCar(Car car) {
        car.drive();
        notifyObservers(car.getDescription() + " is on the road.");
    }
}
