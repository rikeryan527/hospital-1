package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Doctor;
import org.huhehai.hospital.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctorByName(String name) {
        return doctorMapper.getDoctorByName(name);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorMapper.getAllDoctors();
    }

    @Override
    public List<Doctor> getDoctorsByDepartment(String department) {
        return doctorMapper.getDoctorsByDepartment(department);
    }
}