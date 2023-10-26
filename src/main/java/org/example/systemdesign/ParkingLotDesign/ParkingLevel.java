package org.example.systemdesign.ParkingLotDesign;

import lombok.Data;

@Data
public class ParkingLevel {

    private int totalNumberOfSlots;
    private int twoWheelerSlots;

    private int compactVehicleSlots;

    private int fourWheelerSlots;
}
