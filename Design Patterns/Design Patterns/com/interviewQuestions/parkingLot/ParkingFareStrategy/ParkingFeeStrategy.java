package com.interviewQuestions.parkingLot.ParkingFareStrategy;

import com.interviewQuestions.parkingLot.commonEnum.DurationType;

public interface ParkingFeeStrategy {

    double calculateFee(String vehicleType, int duration, DurationType durationType);
}
