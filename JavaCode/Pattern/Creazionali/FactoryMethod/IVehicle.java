public interface IVehicle {
    public void printDetails();
    public void setColor(String colorName);
    public void setDriver(String driverName);
    public void setModel(String modelName);
    public void setStartingSpeed(float startingSpeed);
    public void speedUp(float amount);
}