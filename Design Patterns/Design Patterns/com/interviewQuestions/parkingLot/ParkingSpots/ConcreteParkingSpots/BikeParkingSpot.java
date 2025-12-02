package com.interviewQuestions.parkingLot.ParkingSpots.ConcreteParkingSpots;

import com.interviewQuestions.parkingLot.ParkingSpots.ParkingSpot;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.Vehicle;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
