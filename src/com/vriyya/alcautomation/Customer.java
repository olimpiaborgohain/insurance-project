package com.vriyya.alcautomation;

public class Customer {
    //states
    int id;
    String name;
    String address;
    int pNo;
    String emailId;
    ClaimRequest claimRequest;

    //behaviour


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPNo(int pNo) {
        this.pNo = pNo;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setClaimRequest(ClaimRequest claimRequest) {
        this.claimRequest = claimRequest;
    }

    public String getAddress() {
        return address;
    }

    public int getPNo() {
        return pNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public ClaimRequest getClaimRequest() {
        return claimRequest;
    }
}
