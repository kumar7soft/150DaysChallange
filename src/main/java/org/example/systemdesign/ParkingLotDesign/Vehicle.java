package org.example.systemdesign.ParkingLotDesign;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Random;

@Data
public class Vehicle {

    private int token;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private LocalDateTime vehicelInTime;




}
