public class Car implements IVehicle {
    private String driverName;
    private float speed;

    public Car() {
        this.speed = 5f;
    }

    @Override
    public void addDriver(String name) {
        this.driverName = name;
    }

    @Override
    public void speedUp(int amount) {
        this.speed += amount;
    }

    @Override
    public void printDetails() {
        System.out.println("Driver name: " + this.driverName);
        System.out.println("Current car speed: " + this.speed);
    }
    
}
