package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.RegisterToday;
import java.util.List;

public interface RegisterTodayService {
    List<RegisterToday> getRegisterTodayByPatientName(String patient_Name);
    void addRegisterToday(RegisterToday registerToday);
}