package com.practice.SolidPrinciples.OpenClosed.solution;

import lombok.Data;

import java.util.List;

@Data
public class ISPSubscriber extends Subscriber {

    private long freeUsage;

    //only for demonstration
    @Override
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