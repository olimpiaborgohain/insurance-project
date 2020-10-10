package com.vriyya.alcautomation;

import java.math.BigDecimal;

public class Surveyor extends Employee {
    String officialDesignation;
    BigDecimal salary;

    public void setOfficialDesignation(String officialDesignation) {
        this.officialDesignation = officialDesignation;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getOfficialDesignation() {
        return officialDesignation;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
