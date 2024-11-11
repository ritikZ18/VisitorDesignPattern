public class Vehicle { 


public static class Car implements IVehicle {
   
    private int manufactureDate;

    public Car(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public float accept(IVehicleInspector inspector) {
        return inspector.visit(this);
    }
    // ... other methods

    public String getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

}



public static class Van implements IVehicle {

    private int numberOfDoors;

    public Van(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public float accept(IVehicleInspector inspector) {
        return inspector.visit(this);
    }
    // ... other methods

    public int getNumberOfDoors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfDoors'");
    }
}



public static class Motorbike implements IVehicle {

    private int engineCapacity;


    public Motorbike(int engineCapacity){
        this.engineCapacity = engineCapacity;
    }


    @Override
    public float accept(IVehicleInspector inspector) {
        return inspector.visit(this);
    }
    // ... other methods

    public int getEngineCapacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEngineCapacity'");
    }
}

}