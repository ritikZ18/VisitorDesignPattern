import java.util.List;

public class Act2VehicleService {


    private static Act2VehicleService instance;
    private final IVehicleInspector inspector;

    private  Act2VehicleService(IVehicleInspector inspector){
        this.inspector = inspector;
    }

// static initialization block (requirments)
    static {
        String viProp = System.getProperty("vi");
        IVehicleInspector inspector = VehicleFactory.getVehicleInspector(viProp);
        instance = new Act2VehicleService(inspector);
    }

    public static Act2VehicleService getInstance(){
        return instance;
    }

    //same as AltVehicleServuce
    public float calculateTotal(List<IVehicle> vehicles){
        float total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }

}
