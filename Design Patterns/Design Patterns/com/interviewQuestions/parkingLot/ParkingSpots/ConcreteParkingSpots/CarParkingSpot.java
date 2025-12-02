package com.interviewQuestions.parkingLot.ParkingSpots.ConcreteParkingSpots;

import com.interviewQuestions.parkingLot.ParkingSpots.ParkingSpot;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.Vehicle;

public class CarParkingSpot extends ParkingSpot {


    public CarParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());

    }
}
