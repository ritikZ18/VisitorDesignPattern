public  class AltVehicleInspection implements IVehicleInspector{

    @Override
    public float visit(Vehicle.Car car){
        return 15.0f;
    }
    @Override
    public float visit(Vehicle.Van van){
        return 200.0f;
    }
    @Override
    public float visit(Vehicle.Motorbike motorbike){
        return 75.0f;
    }
    @Override
    public void inspect(IVehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inspect'");
    }
    

}
