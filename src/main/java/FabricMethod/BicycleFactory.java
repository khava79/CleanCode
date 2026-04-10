package FabricMethod;

public class BicycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }

}
