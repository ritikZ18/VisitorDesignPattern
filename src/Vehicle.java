public class Vehicle {

    public static class Car implements IVehicle {
        private String color;
        private int manufactureDate;

        public Car(String color, int manufactureDate) {
            this.manufactureDate = manufactureDate;
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getManufactureDate() {
            return manufactureDate;
        }

        public void setManufactureDate(int manufactureDate) {
            this.manufactureDate = manufactureDate;
        }

        public float accept(IVehicleInspector inspector) {
            return inspector.visit(this);
        }

        public String getModel() {
            return "Car";
        }

    }

    public static class Van implements IVehicle {
        private int storageCapacity;
        private int numberOfDoors;

        public Van(int numberOfDoors, int storageCapacity) {
            this.numberOfDoors = numberOfDoors;
        }

        public int getStorageCapacity() {
            return storageCapacity;
        }

        public void setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public void setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }

        public float accept(IVehicleInspector inspector) {
            return inspector.visit(this);
        }

        public String getModel() {
            return "Van";
        }

    }

    public static class Motorbike implements IVehicle {
        private int engineCapacity;
        private String brand;

        public Motorbike(int engineCapacity, String brand) {
            this.engineCapacity = engineCapacity;
            this.brand = brand;
        }

        public int getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public float accept(IVehicleInspector inspector) {
            return inspector.visit(this);
        }

        public String getModel() {
            return "Motorbike";
        }

    }

}