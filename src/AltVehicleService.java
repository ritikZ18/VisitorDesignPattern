import java.util.List;

public class AltVehicleService {
    private final IVehicleInspector inspector;

    public AltVehicleService(String viProp){
       
        this.inspector = VehicleFactory.getVehicleInspector(viProp);
    }

    public float calculateTotal(List<IVehicle> vehicles){
        float total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }
    
}
