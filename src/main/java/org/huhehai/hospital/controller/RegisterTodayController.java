package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.RegisterToday;
import org.huhehai.hospital.service.RegisterTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registerTodays")
public class RegisterTodayController {

    @Autowired
    private RegisterTodayService registerTodayService;

    // 根据患者姓名查询今日挂号信息
    @GetMapping("/patient/{patient_Name}")
    public ResponseEntity<List<RegisterToday>> getRegisterTodayByPatientName(@PathVariable String patient_Name) {
        List<RegisterToday> registerTodays = registerTodayService.getRegisterTodayByPatientName(patient_Name);
        return new ResponseEntity<>(registerTodays, HttpStatus.OK);
    }

    // 新增今日挂号信息
    @PostMapping("")
    public ResponseEntity<Void> addRegisterToday(@RequestBody RegisterToday registerToday) {
        registerTodayService.addRegisterToday(registerToday);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}