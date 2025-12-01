package com.interviewQuestions.parkingLot.ParkingFareStrategy.ConcreteStrategy;

import com.interviewQuestions.parkingLot.ParkingFareStrategy.ParkingFeeStrategy;
import com.interviewQuestions.parkingLot.commonEnum.DurationType;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {

        switch (vehicleType.toLowerCase()) {

            case "car":
                return durationType == DurationType.HOURS
                        ? duration * 10.0
                        : duration * 10.0 * 24;

            case "bike":
                return durationType == DurationType.HOURS
                        ? duration * 5.0
                        : duration * 5.0 * 24;

            case "truck":
                return durationType == DurationType.HOURS
                        ? duration * 12.0
                        : duration * 12.0 * 24;

            default:
                return durationType == DurationType.HOURS
                        ? duration * 15.0
                        : duration * 15.0 * 24;
        }
    }
}
