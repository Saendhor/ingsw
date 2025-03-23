public class Car implements IVehicle {
    private float speed;
    private String color;
    private String driverName;
    private String modelName;

    private final String vehicleName = "Car";
    
    public Car() {
        this.speed = 40f;
        this.color = "Red";
        this.driverName = "Renato";
        this.modelName = "Renault";
    }

    public void printDetails() {
        System.out.println("Selected vehicle: " + vehicleName);
        System.out.println("Driver: " + getDriver());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        showSpeed();
        System.out.println("\n");
    }

    public float getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getDriver() {
        return driverName;
    }

    public String getModel() {
        return modelName;
    }

    public void setColor(String colorNameInput) {
        this.color = colorNameInput;
    }

    public void setDriver(String driverNameInput) {
        this.driverName = driverNameInput;
    }

    public void setModel(String modelNameInput) {
        this.modelName = modelNameInput;
    }

    public void setStartingSpeed(float startingSpeedInput) {
        this.speed = startingSpeedInput;
    }

    public void showSpeed() {
        System.out.println("Current "+ vehicleName + " is running at " + getSpeed() + " km/h");
    }

    public void speedUp(float amount) {
        this.speed += amount;
    }

}
