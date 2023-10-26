package org.example.systemdesign.ParkingLotDesign;

import java.time.LocalTime;

public class PriceCalculator {

    public int calculateThePrice(VehicleType vehicleType, LocalTime time){

        if(vehicleType == VehicleType.FOUR_WHEELER){
            int price = time.getHour() * 50;
            return price;
        }
        else if(vehicleType == VehicleType.COMPACT_VEHICLE){
            return time.getHour() * 30;
        }else {
            return  time.getHour()*20;
        }
    }
}
