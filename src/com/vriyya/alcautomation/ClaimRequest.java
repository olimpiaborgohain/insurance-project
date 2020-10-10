package com.vriyya.alcautomation;

public class ClaimRequest {
    int claimRequestId;
    double claimAmount;

    public void setClaimRequestId(int claimRequestId) {
        this.claimRequestId = claimRequestId;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public int getClaimRequestId() {
        return claimRequestId;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}
