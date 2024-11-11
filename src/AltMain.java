import java.util.Arrays;
import java.util.List;

public class AltMain {
    public static void main(String[] args) {

    String viProp = System.getProperty("vi");
    AltVehicleService service  =   new AltVehicleService(viProp);


    List<IVehicle> vehicles = Arrays.asList(
        new  Vehicle.Car(2000),
        new Vehicle.Van(2),
        new Vehicle.Motorbike(1212)
    );


    float calculatedTotal = service.calculateTotal(vehicles);
    System.out.println("Total: " + calculatedTotal);    
}
    

}
