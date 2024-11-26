package org.huhehai.hospital.entity;

import java.util.Date;

public class RegistrationList {
//    姓名
    private String name;
//    号码
    private String phoneNumber;
//    年龄
    private Integer age;
//    就诊时间
    private Date visitTime;
//    医生姓名
    private String doctor_Name;
//    科室
    private String department;
//    门诊类型
    private String outpatientType;
//    挂号时间
    private Date registrationTime;
//    挂号号码

    private String medicalNumber;
//    挂号确认
    private Boolean reservationConfirmation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOutpatientType() {
        return outpatientType;
    }

    public void setOutpatientType(String outpatientType) {
        this.outpatientType = outpatientType;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(String medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public Boolean getReservationConfirmation() {
        return reservationConfirmation;
    }

    public void setReservationConfirmation(Boolean reservationConfirmation) {
        this.reservationConfirmation = reservationConfirmation;
    }

}
