package com.interviewQuestions.parkingLot.VehicleFactoryPattern.ConcreteVehicles;

import com.interviewQuestions.parkingLot.ParkingFareStrategy.ParkingFeeStrategy;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.Vehicle;

public class TruckVehicle extends Vehicle {
    public TruckVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, "truck", feeStrategy);
    }
}
