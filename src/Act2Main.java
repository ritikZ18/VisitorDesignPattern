import java.util.Arrays;
import java.util.List;

public class Act2Main {
    public static void main(String[] args){
        Act2VehicleService service = Act2VehicleService.getInstance();

        List<IVehicle> vehicles = Arrays.asList(
                new Vehicle.Car("Red",21), //black== 100, other == 50
                new Vehicle.Van(212,4),
                new Vehicle.Motorbike(3000,"Mitsubishi")
        );

        float total = service.calculateTotal(vehicles);
        System.out.println("Total: " +total);
    }
}

