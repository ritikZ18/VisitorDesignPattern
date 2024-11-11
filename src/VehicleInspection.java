public class VehicleInspection implements IVehicleInspector {
    @Override
    public float visit(Vehicle.Car car) {
        int serviceCharge = 0;
        if(car.getColor()=="Black"){
            serviceCharge += 100;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Service Charge for Car: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public float visit(Vehicle.Van van) {
        int serviceCharge = 0;
        if(van.getNumberOfDoors()>4){
            serviceCharge += 500;
        }else{
            serviceCharge += 100;
        }
        System.out.println("Service Charge for Van: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public float visit(Vehicle.Motorbike motorbike) {
        int serviceCharge = 0;
        if(motorbike.getEngineCapacity()>=200){
            serviceCharge += 200;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Service Charge for Motorbike: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public void inspect(IVehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inspect'");
    }
}
