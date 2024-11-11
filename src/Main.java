import java.io.FileReader;
import java.util.List;
import java.util.ArrayList; 

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Main {
    public static void main(String[] args) {

        List<IVehicle> vehicles = new ArrayList<IVehicle>();
        String filePath = "data.json";

        java.io.File file = new java.io.File(filePath);
        if (!file.exists()) {
            System.out.println("Error-> " + filePath + " doesnt exist.");
            return;
        }

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            // Parse the JSON array from the file
            JSONArray jsonArray = (JSONArray) parser.parse(reader);

            for (Object obj : jsonArray) {
                JSONObject vehicleObj = (JSONObject) obj;
                String vtype = (String) vehicleObj.get("vtype");

                // Create instances based on vtype
                switch (vtype.trim()) {
                    case "Car":
                        String color = (String) vehicleObj.get("color");
                        String myear = (String) vehicleObj.get("myear");
                        vehicles.add(new Vehicle.Car(color, Integer.parseInt(myear)));
                        break;

                    case "Van":
                        String storage = (String) vehicleObj.get("storage");
                        String numdoors = (String) vehicleObj.get("numdoors");
                        vehicles.add(new Vehicle.Van(Integer.parseInt(storage), Integer.parseInt(numdoors)));
                        break;

                    case "Motorbike":
                        String engine = (String) vehicleObj.get("engine");
                        String brand = (String) vehicleObj.get("brand");
                        vehicles.add(new Vehicle.Motorbike(Integer.parseInt(engine), brand));
                        break;

                    default:
                        System.out.println("Unknown vehicle type: " + vtype);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (IVehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        int totalCost = new VehicleService().calculateTotal(vehicles.toArray(new IVehicle[0]));
        System.out.println("Total Service Charge: $" + totalCost);
    }
}
