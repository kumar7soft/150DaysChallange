package org.example.systemdesign.ParkingLot;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.systemdesign.ParkingLot.Model.ParkingSlotType;
import org.example.systemdesign.ParkingLot.Model.Vehicle;

@Getter
@Setter
public class ParkingSlot {
    String name;
    @Builder.Default
    boolean isAvailable = true;
    Vehicle vehicle;
    ParkingSlotType parkingSlotType;

    public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
        this.name = name;
        this.parkingSlotType = parkingSlotType;
    }

    protected void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable=false;
    }

    protected void removeVehicle(Vehicle vehicle){
        this.vehicle=null;
        this.isAvailable=true;
    }
}
