package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor getDoctorByName(String name);
    List<Doctor> getAllDoctors();
    List<Doctor> getDoctorsByDepartment(String department);
}