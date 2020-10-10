package com.vriyya.alcautomation;

import java.awt.font.LineBreakMeasurer;
import java.math.BigDecimal;

public class Manager extends Employee {
    String officialDesignation;
    BigDecimal salary;
    Surveyor surveyor;
    //one to one -> one to many


    public void setOfficialDesignation(String officialDesignation) {
        this.officialDesignation = officialDesignation;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSurveyor(Surveyor surveyor) {
        this.surveyor = surveyor;
    }

    public String getOfficialDesignation() {
        return officialDesignation;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Surveyor getSurveyor() {
        return surveyor;
    }
}
