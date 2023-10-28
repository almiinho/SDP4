public class CarOwner implements Observer {
    private String name;

    public CarOwner(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received the following event: " + event);
    }
}
