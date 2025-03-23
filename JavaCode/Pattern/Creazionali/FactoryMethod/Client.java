public class Client {
    public static void testVehicleCreation(IVehicle selectedVehicle) {
        selectedVehicle.printDetails();
    }

    public static void main (String[] args) {
        //Creating the objects
        IVehicle myAutobus = VehicleFactory.factoryVehicle("Autobus");
        IVehicle myCar = VehicleFactory.factoryVehicle("Car");
        IVehicle myMoto = VehicleFactory.factoryVehicle("Moto");

        testVehicleCreation(myAutobus);
        testVehicleCreation(myCar);
        testVehicleCreation(myMoto);

    }
}
