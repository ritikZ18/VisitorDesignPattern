import java.util.Arrays;
import java.util.List;


public class AltMain {
    public static void main(String[] args) {

    String viProp = System.getProperty("vi");
    if(viProp == null){
        viProp = "altProp";
    }
    AltVehicleService service  =   new AltVehicleService(viProp);


    List<IVehicle> vehicles = Arrays.asList(
        new Vehicle.Car("Black",2000),
        new Vehicle.Van(0,2),
        new Vehicle.Motorbike(250,"Suzuki")
    );


    float calculatedTotal = service.calculateTotal(vehicles);
    System.out.println("Total: " + calculatedTotal);    
}
    

}
