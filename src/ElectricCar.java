public class ElectricCar implements Car {
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println(model + " Electric Car is driving silently.");
    }

    @Override
    public void refuel() {
        System.out.println("Charging " + model + " Electric Car's batteries.");
    }

    @Override
    public void doMaintenance() {
        System.out.println(model + " Electric Car is having maintenance.");
    }

    @Override
    public String getDescription() {
        return model + " Electric Car";
    }
}
