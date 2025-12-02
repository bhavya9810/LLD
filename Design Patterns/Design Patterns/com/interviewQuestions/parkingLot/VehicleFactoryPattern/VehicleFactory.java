package com.interviewQuestions.parkingLot.VehicleFactoryPattern;

import com.interviewQuestions.parkingLot.ParkingFareStrategy.ParkingFeeStrategy;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.ConcreteVehicles.BikeVehicle;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.ConcreteVehicles.CarVehicle;
import com.interviewQuestions.parkingLot.VehicleFactoryPattern.ConcreteVehicles.TruckVehicle;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy feeStrategy) {

        if (vehicleType.equalsIgnoreCase("car")) {
            return new CarVehicle(licensePlate, feeStrategy);
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return new BikeVehicle(licensePlate, feeStrategy);
        }
        else return new TruckVehicle(licensePlate, feeStrategy);

    }
}
