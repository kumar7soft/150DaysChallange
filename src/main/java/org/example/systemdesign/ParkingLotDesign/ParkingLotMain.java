package org.example.systemdesign.ParkingLotDesign;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ParkingLotMain {

    public static void main(String[] args) throws InterruptedException {

        SlotsAvailableService slotsAvailableService =new SlotsAvailableService();
        Map<String, ParkingLevel> stringParkingLevelMap = slotsAvailableService.LoadTotalParkingLots();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scanning your vehicle in progress..");
        Thread.sleep(10000);
        System.out.println("Scanning your vehicle is completed .Please collect token ....");
       Vehicle vehicle = getTheVehicleInformationFromScanningMachine();
       new VehicleHandler().addNewVehicle(vehicle);
        Map<String, ParkingLevel> parkingSlotsInfo = SlotsAvailableService.parkingSlotsInfo;
        ParkingLevel parkingLevel = parkingSlotsInfo.get("PL1");
        int fourWheelerSlots = parkingLevel.getFourWheelerSlots();
        parkingLevel.setFourWheelerSlots(fourWheelerSlots-1);
        parkingSlotsInfo.put("PL1",parkingLevel);


    }

    private static Vehicle getTheVehicleInformationFromScanningMachine(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNumber("KA-01-9999");
        vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
        vehicle.setVehicelInTime(LocalDateTime.now());
        vehicle.setToken(generateRandonNumber());
        return vehicle;
    }

    private static int generateRandonNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        return randomNumber;
    }
}
