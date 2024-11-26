package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.RegisterToday;
import org.huhehai.hospital.mapper.RegisterTodayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterTodayServiceImpl implements RegisterTodayService {

    @Autowired
    private RegisterTodayMapper registerTodayMapper;

    @Override
    public List<RegisterToday> getRegisterTodayByPatientName(String patient_Name) {
        return registerTodayMapper.getRegisterTodayByPatientName(patient_Name);
    }

    // 检查此处，看是否正确实现了addRegisterToday方法
    @Override
    public void addRegisterToday(RegisterToday registerToday) {
        registerTodayMapper.addRegisterToday(registerToday);
    }
}