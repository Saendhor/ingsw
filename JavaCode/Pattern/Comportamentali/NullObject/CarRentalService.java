package NullObject;

public class CarRentalService {
    private Car car;
 
    public CarRentalService(Car car) {
        this.car = car;
    }
 
    public void rentCar() {
        car.drive();
        car.stop();
    }
}