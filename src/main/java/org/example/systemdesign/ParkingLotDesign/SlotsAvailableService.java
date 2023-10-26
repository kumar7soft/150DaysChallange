package org.example.systemdesign.ParkingLotDesign;

import java.util.HashMap;
import java.util.Map;

public class SlotsAvailableService {

    static Map<String,ParkingLevel> parkingSlotsInfo = new HashMap<>();
    public  Map<String,ParkingLevel> LoadTotalParkingLots(){

        ParkingLevel parkingLevel1 =new ParkingLevel();
        parkingLevel1.setTotalNumberOfSlots(30);
        parkingLevel1.setFourWheelerSlots(10);
        parkingLevel1.setCompactVehicleSlots(5);
        parkingLevel1.setTwoWheelerSlots(15);


        ParkingLevel parkingLevel2 =new ParkingLevel();
        parkingLevel2.setTotalNumberOfSlots(50);
        parkingLevel2.setFourWheelerSlots(10);
        parkingLevel2.setCompactVehicleSlots(15);
        parkingLevel2.setTwoWheelerSlots(25);

        ParkingLevel parkingLevel3 =new ParkingLevel();
        parkingLevel3.setTotalNumberOfSlots(50);
        parkingLevel3.setFourWheelerSlots(10);
        parkingLevel3.setCompactVehicleSlots(15);
        parkingLevel3.setTwoWheelerSlots(25);


        parkingSlotsInfo.put("PL1",parkingLevel1);
        parkingSlotsInfo.put("PL2",parkingLevel2);
        parkingSlotsInfo.put("PL3",parkingLevel3);

        return parkingSlotsInfo;

    }

    private static void updateSlotsAvailable( VehicleType vehicleType,String level,String type){
        ParkingLevel parkingLevel = parkingSlotsInfo.get(level);
        if(vehicleType == VehicleType.COMPACT_VEHICLE){
            int compactVehicleSlots = parkingLevel.getCompactVehicleSlots();
            if(type =="add"){
                compactVehicleSlots=compactVehicleSlots+1;
            }else{
                compactVehicleSlots=compactVehicleSlots-1;
            }
            parkingLevel.setCompactVehicleSlots(compactVehicleSlots);
            parkingSlotsInfo.put(level,parkingLevel);
        }else if(vehicleType == VehicleType.TWO_WHEELER){
            int twoWheelerSlots = parkingLevel.getTwoWheelerSlots();
            if(type =="add"){
                twoWheelerSlots=twoWheelerSlots+1;
            }else{
                twoWheelerSlots=twoWheelerSlots-1;
            }

            parkingLevel.setTwoWheelerSlots(twoWheelerSlots);
            parkingSlotsInfo.put(level,parkingLevel);
        }else if(vehicleType == VehicleType.FOUR_WHEELER){

            int fourWheelerSlots = parkingLevel.getFourWheelerSlots();

            if(type =="add"){
                fourWheelerSlots=fourWheelerSlots+1;
            }else{
                fourWheelerSlots=fourWheelerSlots-1;
            }
            parkingLevel.setFourWheelerSlots(fourWheelerSlots);
            parkingSlotsInfo.put(level,parkingLevel);
        }
    }
}
