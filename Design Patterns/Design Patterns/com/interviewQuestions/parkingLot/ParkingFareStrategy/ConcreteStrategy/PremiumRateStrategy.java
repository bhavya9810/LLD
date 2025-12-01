package com.interviewQuestions.parkingLot.ParkingFareStrategy.ConcreteStrategy;

import com.interviewQuestions.parkingLot.ParkingFareStrategy.ParkingFeeStrategy;
import com.interviewQuestions.parkingLot.commonEnum.DurationType;

public class PremiumRateStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {

        switch (vehicleType.toLowerCase()) {

            case "car":
                return durationType == DurationType.HOURS
                        ? duration * 15.0
                        : duration * 15.0 * 24;

            case "bike":
                return durationType == DurationType.HOURS
                        ? duration * 8.0
                        : duration * 8.0 * 24;

            case "truck":
                return durationType == DurationType.HOURS
                        ? duration * 18.0
                        : duration * 18.0 * 24;

            default:
                return durationType == DurationType.HOURS
                        ? duration * 20.0
                        : duration * 20.0 * 24;
        }

    }
}
