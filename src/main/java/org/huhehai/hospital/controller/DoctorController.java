package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.Doctor;
import org.huhehai.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // 根据医生姓名获取医生信息
    @GetMapping("/{name}")
    public ResponseEntity<Doctor> getDoctorByName(@PathVariable String name) {
        Doctor doctor = doctorService.getDoctorByName(name);
        if (doctor!= null) {
            return new ResponseEntity<>(doctor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 获取所有医生信息
    @GetMapping("")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        List<Doctor> doctors = doctorService.getAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    // 根据科室获取医生信息
    @GetMapping("/department/{department}")
    public ResponseEntity<List<Doctor>> getDoctorsByDepartment(@PathVariable String department) {
        List<Doctor> doctors = doctorService.getDoctorsByDepartment(department);
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
}