package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor getDoctorByName(String name);
    List<Doctor> getAllDoctors();
    List<Doctor> getDoctorsByDepartment(String department);
    // 新增根据多个条件查询医生信息的方法
    List<Doctor> getDoctorsByConditions(String department, String outpatientType, String visitTime);
}