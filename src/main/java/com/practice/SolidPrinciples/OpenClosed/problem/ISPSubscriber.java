package com.practice.SolidPrinciples.OpenClosed.problem;

import lombok.Data;

import java.util.List;

@Data
public class ISPSubscriber {

    private Long subscriberId;

    private String address;

    private Long phoneNumber;

    private int baseRate;

    private long freeUsage;

    //only for demonstration
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        
        if(chargeableData <= 0) {
        	return 0;
        }
        return chargeableData*baseRate/100;
    }
}