public class Moto implements IVehicle {
    private String driverName;
    private float speed;

    public Moto() {
        this.speed = 6f; 
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
