package com.vriyya.alcautomation;

public class Employee {
    int id;
    String name;
    String address;
    String pNo;
    char gender;
    String idProof;

    public int getId() {
        return id;
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

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getpNo() {
        return pNo;
    }

    public char getGender() {
        return gender;
    }

    public String getIdProof() {
        return idProof;
    }
}
