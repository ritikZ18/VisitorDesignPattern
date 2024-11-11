import java.util.List;

public class Act3VehicleService {

private static final Act3VehicleService instance;
private final IVehicleInspector inspector;
private final  IEmissionStrategy emissionStrategy;


private Act3VehicleService(IVehicleInspector inspector, IEmissionStrategy emissionStrategy){
    this.inspector = inspector;
    this.emissionStrategy = emissionStrategy;
}



static  {
    String viProp = System.getProperty("vi");
    IVehicleInspector inspector = VehicleFactory.getVehicleInspector(viProp);

    String esProp =  System.getProperty("es");
    IEmissionStrategy emissionStrategy;
    if("one".equals(esProp)){
        emissionStrategy= new EmissionStrategy.OneEmissionStrategy();
    }
    else if("two".equals(esProp)){
        emissionStrategy = new EmissionStrategy.TwoEmissionStrategy();
    }
    else {
        emissionStrategy = new EmissionStrategy.NullEmissionStrategy() ;
    }

    instance = new Act3VehicleService(inspector, emissionStrategy);

//    System.out.println("Using Emission Strategy: " + (esProp.equals("one") ? "OneEmissionStrategy": esProp.equals("two") ? "TwoEmissionStrategy" : "NullEmissionStrategy"));


}


public static Act3VehicleService getInstance(){
    return  instance;
}

public float calculateTotal(List<IVehicle> vehicles){
    float total = 0;
    for(IVehicle vehicle : vehicles){
        float inspectionFee = vehicle.accept(inspector);
        //emission fees calculations
        int emissionFee = emissionStrategy.computeEmissionsFee(vehicle);
        float co2Emissions = vehicle.co2Emissions();


        total = total + (inspectionFee + emissionFee);
   //     total = total + emissionStrategy.computeEmissionsFee(vehicle) + vehicle.accept(inspector);
        System.out.println("Vehicle: " + vehicle.toString());
        System.out.println("CO2 Emission: "+co2Emissions);
        System.out.println("Inspection Fee: "+inspectionFee);
        System.out.println("Emission Fee: "+emissionFee);
        System.out.println("Total: "+(inspectionFee + emissionFee));
        System.out.println();
    }
    return total;
}

}
