public class Moto implements IVehicle {
    private float speed;
    private String color;
    private String driverName;
    private String modelName;
    
    public Moto() {}

    public void printDetails() {
        System.out.println("Driver: " + getDriver());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
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
        System.out.println("Current moto is running at " + getSpeed() + " m/s");
    }

    public void speedUp(float amount) {
        this.speed += amount;
    }

}
