public class VehicleFactory {
    public static IVehicle factoryVehicle(String type) {
        switch (type) {
            case "Autobus": return new Autobus();
            case "Car": return new Car();
            case "Moto": return new Moto();

        }
        return null;
    }
    
}
