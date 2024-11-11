public class EmissionStrategy {


    public static  class OneEmissionStrategy implements IEmissionStrategy {
        @Override
        public int computeEmissionsFee(IVehicle vehicle){
            return Math.max((int)vehicle.co2Emissions() - 1000,0);
        }
    }


    public static  class TwoEmissionStrategy implements IEmissionStrategy {
        @Override
        public int computeEmissionsFee(IVehicle vehicle){
            return Math.max((int)vehicle.co2Emissions()- 1100,10);
        }
    }


    public static  class NullEmissionStrategy implements IEmissionStrategy {
        @Override
        public int computeEmissionsFee(IVehicle vehicle){
            return 0;
        }
    }

}
