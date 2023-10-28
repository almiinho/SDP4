public class GasolineCar implements Car {
    private  String model;

    public GasolineCar(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println(model + " Gasoline Car is on the road.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " Gasoline Car.");
    }

    @Override
    public void doMaintenance() {
        System.out.println(model + " Gasoline Car is having maintenance.");
    }

    @Override
    public String getDescription() {
        return model + " Gasoline Car";
    }
}
