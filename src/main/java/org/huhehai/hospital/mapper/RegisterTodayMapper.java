package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.RegisterToday;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterTodayMapper {
    List<RegisterToday> getRegisterTodayByPatientName(String patient_Name);
    void addRegisterToday(RegisterToday registerToday);
}