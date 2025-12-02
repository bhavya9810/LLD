package com.interviewQuestions.parkingLot.VehicleFactoryPattern.ConcreteVehicles;

import com.interviewQuestions.parkingLot.ParkingFareStrategy.ParkingFeeStrategy;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.Vehicle;

public class BikeVehicle extends Vehicle {
    public BikeVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, "bike", feeStrategy);
    }
}
