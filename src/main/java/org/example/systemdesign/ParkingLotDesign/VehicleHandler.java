package org.example.systemdesign.ParkingLotDesign;

import java.util.ArrayList;
import java.util.List;

public class VehicleHandler {

     List<Vehicle> vehicleList =new ArrayList<>();

    public  void addNewVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void removeVehicleFromList(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }
}
