package com.interviewQuestions.parkingLot;

import com.interviewQuestions.parkingLot.ParkingSpots.ParkingSpot;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.Vehicle;

import java.util.List;

public class ParkingLot {

    private List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicleType)) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
           spot.parkVehicle(vehicle);
            System.out.println("Vehicle Parked successfully on spot "+spot.getSpotNumber());
            return spot;
        }
        System.out.println("No Parking spot available for "+vehicle.getVehicleType()+" !");
        return null;
    }
}
