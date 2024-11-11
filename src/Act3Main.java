import java.util.Arrays;
import java.util.List;

public class Act3Main {

    public static void main(String[] args){
        Act3VehicleService service = Act3VehicleService.getInstance();

        List<IVehicle> vehicles  = Arrays.asList(
                new Vehicle.Car("Green", 1969),
                new Vehicle.Car("Blue", 2002),
                new Vehicle.Van(2000, 6),
                new Vehicle.Motorbike(4000,"Mr. Onitsuka")

        );

        float total = service.calculateTotal(vehicles);
    System.out.println("Grand-Total: " +total);
    }
}
